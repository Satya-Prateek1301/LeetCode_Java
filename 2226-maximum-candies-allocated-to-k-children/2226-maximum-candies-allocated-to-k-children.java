class Solution {
    public boolean isPossible(int[] candies, long mid, long k){
        long count = 0;
        for(long i : candies){
            count += i / mid;
        }
        if(count >= k){
            return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        long left = 1;
        long right = 0;
        for(int i : candies){
            right = Math.max(right, i);
        }
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(isPossible(candies, mid, k)){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return (int)right;
    }
}