class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        int count = 0;
        int storage = 0;
        for(int i = 0 ; i <nums.length ; i++){
            storage = nums[i] - min;
            count += storage;
        }
        

        return count;
    }
}