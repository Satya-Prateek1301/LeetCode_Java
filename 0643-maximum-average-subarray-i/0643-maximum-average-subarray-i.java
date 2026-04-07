class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n =nums.length;
        double sum = 0.0;
        double maxAvg = 0.0;
        double avg = 0.0;
        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
            avg = sum/k;
        }

        maxAvg = avg;

        for(int i = 1 ; i <= n - k ; i++){
            sum = sum - nums[i - 1] + nums[i + k - 1];
            avg = sum/k;
            maxAvg = Math.max(maxAvg,avg);
        }
        
        return  maxAvg;
    }
}