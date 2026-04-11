class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;
        long[] suffixProd = new long[n];
        suffixProd[n - 1] = 1;

        for(int i = n - 2 ; i >= 0 ; i--){
            if(suffixProd[i + 1] > Long.MAX_VALUE / nums[i + 1]){
                suffixProd[i] = Long.MAX_VALUE;
            }
            else {
                suffixProd[i] = suffixProd[i + 1] * nums[i + 1];
            }
        }
        long leftSum = 0;
        for(int i = 0 ; i < n ; i++){
            if(leftSum == suffixProd[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}