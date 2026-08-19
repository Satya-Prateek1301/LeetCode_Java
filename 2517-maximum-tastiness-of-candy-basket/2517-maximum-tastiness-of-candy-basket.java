class Solution {
    public boolean isPossible(int[] price, int mid, int k){
        int count = 0;
        int currCandy = price[0];
        for(int i = 1 ; i < price.length ; i++){
            if(price[i] - currCandy >= mid){
                count++;
                currCandy = price[i];
            }
            if(count >= k - 1){
                return true;
            }
        }
        return false;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int left = 0;
        int right = 0;
        for(int i : price){
            right = Math.max(right, i);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(price, mid, k)){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }
}