class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n =  arr.length;

        int minDiff = Integer.MAX_VALUE;
        for(int i = 1 ; i < n ; i++){
            int diff = arr[i] - arr[i - 1];
            minDiff = Math.min(minDiff, diff);
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1 ; i < n ; i++){
            if(arr[i] - arr[i - 1] == minDiff){
                list.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return list;
    }
}