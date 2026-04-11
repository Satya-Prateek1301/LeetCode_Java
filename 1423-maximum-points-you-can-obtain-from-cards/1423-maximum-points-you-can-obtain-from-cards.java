class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;
        int minLen = 0;
        for(int i = 0 ; i < k ; i++){
            lSum = lSum + nums[i];
        }
        maxSum = lSum;
        minLen = n - 1;
        for(int i = k - 1 ; i >= 0 ; i--){
            lSum = lSum - nums[i];
            rSum = rSum + nums[minLen];
            minLen--;
            maxSum = Math.max(maxSum, lSum + rSum);
        }
        return maxSum;
    }
}