class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int num : nums){
            low = Math.min(low, num);
            high += num;
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            int parts = 1;
            int currSum = 0;
            for (int num : nums) {
                if(num > mid){
                    parts = k + 1;
                    break;
                }
                if (currSum + num > mid) {
                    parts++;
                    currSum = num;
                } else {
                    currSum += num;
                }
            }
            if (parts <= k) {
                high = mid - 1;
                ans = mid;
            } else {
                low = mid + 1;  
            }
        }
        return ans;
    }
}