class Solution {
    public long maximumScore(int[] nums) {
        long prefixSum = 0;
        long maxScore = Integer.MIN_VALUE;
        int n = nums.length;
        long[] suffixMin = new long[n];
        suffixMin[n - 1] = nums[n - 1];
        
        if (n < 2){ 
            return 0;
        };

        for(int i = n - 2 ; i >= 0 ; i--){
            suffixMin[i] = Math.min(suffixMin[i+1],nums[i]);
        }

        for(int i = 0 ; i < n - 1 ; i++){
            prefixSum += nums[i];
            maxScore = Math.max(maxScore, prefixSum - suffixMin[i + 1]);
        }

        return maxScore;
    }
}