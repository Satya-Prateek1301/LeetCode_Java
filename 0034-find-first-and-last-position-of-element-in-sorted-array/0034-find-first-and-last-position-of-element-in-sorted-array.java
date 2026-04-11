class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIdx = -1;
        int lastIdx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                firstIdx = i;
                break;
            }
        }
        for(int i = nums.length - 1; i >= 0 ; i--){
            if(nums[i] == target){
                lastIdx = i;
                break;
            }
        }
        return new int[] {firstIdx, lastIdx};
    }
}