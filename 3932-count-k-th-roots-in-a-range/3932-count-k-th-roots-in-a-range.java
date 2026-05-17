class Solution {
    private long find(long lim, int k){
        if(lim < 0){
            return 0;
        }
        long low = 1;
        long high = (k == 1) ? 1_000_000_000L : 100000L;
        long ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(power(mid, k) <= lim){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans + 1;
    }
    private long power(long x, int k){
        long res = 1;
        for(int i = 0 ; i < k ; i++){
            if(res > Long.MAX_VALUE/x){
                return Long.MAX_VALUE;
            }
            res *= x;
        }
        return res;
    }
    public int countKthRoots(int l, int r, int k) {
        long rightCount = find(r, k);
        long leftCount = find(l - 1, k);
        return (int)(rightCount - leftCount);
    }
}