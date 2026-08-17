class Solution {
    public boolean isPossible(int[] quantities, int mid, int n){
        int len = quantities.length;
        int divSum = 0;
        for(int i = 0 ; i < len ; i++){
            divSum += (quantities[i] + mid - 1) / mid;
            if(divSum > n){
                return false;
            }
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1;
        int right = 0;
        for(int i : quantities){
            right = Math.max(right, i);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isPossible(quantities, mid, n)){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}