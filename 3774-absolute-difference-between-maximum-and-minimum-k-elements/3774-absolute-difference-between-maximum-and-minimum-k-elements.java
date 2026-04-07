class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int maxSum = 0;
        int minSum = 0;
        for(int i = 0 ; i < k ; i++){
            minSum += nums[i];
        }
        for(int i = len - k ; i < len ; i++){
            maxSum += nums[i];
        }

        return Math.abs(maxSum - minSum);
    }
}