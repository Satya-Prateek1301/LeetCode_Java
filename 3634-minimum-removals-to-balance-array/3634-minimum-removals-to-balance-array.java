class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int min = 0;
        int max = 0;
        int ans = 0;
        if(len == 1){
            return 0;
        }
        for(int right = 0 ; right < len ; right++){
            while(nums[right] > (long)nums[left] * k){
                left++;
            }
            ans = Math.max(ans,(right - left + 1));
        }
        return len - ans;
    }
}