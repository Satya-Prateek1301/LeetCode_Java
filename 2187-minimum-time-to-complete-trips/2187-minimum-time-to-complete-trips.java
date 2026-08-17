class Solution {
    public boolean isPossible(int[] time, long mid, int  totalTrips){
        long trips = 0;
        for(int i = 0 ; i < time.length ; i++){
            trips += mid / time[i];
            if(trips >= totalTrips){
                return true;
            }
        }
        return false;
    }
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long right = 0;
        for(int i : time){
            right = Math.max(right, (long)i * totalTrips);
        }
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(isPossible(time, mid, totalTrips)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}