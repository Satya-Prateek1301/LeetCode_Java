class Solution {
    public boolean isPossible(int[] nums, int mid, int k){
        int parts = 1;
        int sum = 0;
        for(int num : nums){
            if(sum + num > mid){
                parts++;
                sum = num;
            }
            else{
                sum += num;
            }
            if(parts > k){
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k){
        int left = 0;
        int right = 0;
        for(int num : nums){
            left = Math.max(left, num);
            right += num;
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            if(isPossible(nums, mid, k)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}