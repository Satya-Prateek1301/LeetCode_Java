class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        int j = n - 1;
        int i = 0;
        while(i < j){
            sum = nums[i] + nums[j];
            maxSum = Math.max(maxSum,sum);
            i++;
            j--;
        }
        return maxSum;
    }
}