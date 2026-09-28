class Solution {
    public boolean isPossible(int[] ranks, long mid, int cars){
        long x = 0;
        for(int i : ranks){
            x += Math.sqrt(mid/i);
            // x += i + (mid - 1) / mid;
            // x += i;
        }
        if(x < cars){
            return false;
        }
        return true;
    }
    public long repairCars(int[] ranks, int cars) {
        long left = 1;
        long max = Long.MIN_VALUE;
        for(int i : ranks){
            max = Math.max(max, i);
        }
        long right = (long)(max * cars * cars);
        long ans=0;
        while(left <= right){
            long mid = left + (right - left) / 2;
            if(isPossible(ranks, mid, cars)){
                ans=mid;
                right = mid-1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}