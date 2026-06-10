class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Long min = Long.MAX_VALUE;
        Long max = Long.MIN_VALUE;
        for(int i : nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return (long)(k * (max - min));
    }
}