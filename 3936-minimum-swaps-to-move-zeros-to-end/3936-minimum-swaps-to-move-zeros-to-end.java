class Solution {
    public int minimumSwaps(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int swap = 0;
        while(left < right){
            while(left < right && nums[right] == 0){
                right--;
            }
            if(nums[left] == 0 && left < right){
                swap++;
                right--;
            }
            left++;
        }
        return swap;
    }
}