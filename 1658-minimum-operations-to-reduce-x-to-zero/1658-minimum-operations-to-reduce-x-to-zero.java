class Solution {
    public int minOperations(int[] nums, int x) {
        int len = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int totalSum = 0;
        int longestLen = -1;

        for(int num : nums){
            totalSum += num;
        }

        int target = totalSum - x;

        if(target < 0){
            return -1;
        }

        while(right < len){
            sum += nums[right];
            
            while(sum > target){
                sum -= nums[left];
                left++;
            }
            if(sum == target){
                longestLen = Math.max(longestLen, right - left + 1);

            }
            right++;
        }
        return longestLen == -1 ? -1 : len - longestLen;
    }
}