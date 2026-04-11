class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long[] conver = new long[n];
        int max = nums[0];
        conver[0] = 2 * max;
        for(int i = 1 ; i < n ; i++){
            max = Math.max(max, nums[i]);
            conver[i] = nums[i] + max + conver[i - 1];
        }
        return conver;
    }
}