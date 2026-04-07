class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int[] arr = new int[nums.length+1];

        for(int i: nums){
            arr[i]++;
        }
        int max = 0;
        for(int  i = 0 ; i < arr.length ; i++){
            max = Math.max(max,arr[i]);
        }
    
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]>1){
                list.add(i);
            }
        }
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] == 0){
                list.add(i);
            }
        }
        int[] arr2 = new int[max];
        for(int i = 0 ; i < max ; i++){
            arr2[i] = list.get(i);
        }

        return arr2;
    }
}