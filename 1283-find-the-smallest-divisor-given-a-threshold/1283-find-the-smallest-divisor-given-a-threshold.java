class Solution {
    public boolean isPossible(int[] nums, int mid, int threshold){
        int divSum = 0;
        for(int i : nums){
            divSum += (i + (mid - 1)) / mid;
            if(divSum > threshold){
                return false;
            }
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        for(int i : nums){
            right = Math.max(right,i);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(nums, mid, threshold)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return  left;
    }
}