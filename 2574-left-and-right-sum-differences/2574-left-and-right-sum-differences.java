class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int left = 0;
        for (int i = 1; i < n; i++) {
            left += nums[i - 1];
            leftSum[i] = left;
        }
        int right = 0;
        for (int i = n - 2; i >= 0; i--) {
            right += nums[i + 1];
            rightSum[i] = right;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}