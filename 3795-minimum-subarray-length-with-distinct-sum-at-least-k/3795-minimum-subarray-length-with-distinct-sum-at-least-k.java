class Solution {
    public int minLength(int[] nums, int k) {
        int left = 0;
        long sum = 0; 
        int ans = Integer.MAX_VALUE;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            if (freq.get(nums[right]) == 1) {
                sum += nums[right];
            }
            while(sum >= k){
                ans = Math.min(ans, right - left + 1);
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if(freq.get(nums[left]) == 0){
                    sum -= nums[left];
                }
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}