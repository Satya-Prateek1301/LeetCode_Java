class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if(n == 0){
            return new int[0];
        }
        int[] arr2 = arr.clone();
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr2);
        int rank = 1;
        map.put(arr2[0],rank);
        for(int i = 1 ; i < n ; i++){
            if(arr2[i] == arr2[i - 1]){
                map.put(arr2[i],rank);
            }
            else{
                map.put(arr2[i],++rank);
            }
        }
        int[] arr1 = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr1[i] = map.get(arr[i]);
        }
        return arr1;
    }
}