class Solution {
    public boolean isPossible(int[] bloomDay, int mid, int m, int k){
        int bouquets = 0;
        int flower = 0;
        for(int i : bloomDay){
            if(i <= mid){
                flower++;
                if(flower == k){
                    bouquets++;
                    flower = 0;
                }
            }
            else{
                flower = 0;
            }
        }
        return bouquets >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long)m * k;
        if(required > bloomDay.length){
            return -1;
        }
        int left = 1;
        int right = 0;
        for(int i : bloomDay){
            right = Math.max(right, i);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(bloomDay, mid, m, k)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}