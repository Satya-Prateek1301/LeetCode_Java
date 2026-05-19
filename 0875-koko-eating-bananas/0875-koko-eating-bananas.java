class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i : piles){
            max = Math.max(max, i);
        }
        int low = 1;
        int high = max;

        while(low < high){
            int mid = low + (high-low) / 2;
            int hour = 0;
            for(int pile : piles){
                hour += (pile + mid - 1) / mid;
            }
            if(hour <= h){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}