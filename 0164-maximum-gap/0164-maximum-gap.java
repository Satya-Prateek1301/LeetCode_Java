class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2){
            return 0;
        }
        int diff = 0;
        int maxDiff = Integer.MIN_VALUE;
        int left = 0;
        int right = 1;
        Arrays.sort(nums);
        while(right < nums.length){
            diff = Math.abs(nums[right] - nums[left]);
            maxDiff = Math.max(maxDiff,diff);
            right++;
            left++;
        }
        return maxDiff;
    }
}