class Solution {
    public boolean digitProduct(int num, int t){
        int product = 1;
        while(num > 0){
            product *= num % 10;
            num /= 10;
        }
        return product % t == 0;
    }
    public boolean isPossible(int x, int n, int t){
        for(int i = n; i <= x; i++){
            if(digitProduct(i, t)){
                return true;
            }
        }
        return false;
    }
    public int smallestNumber(int n, int t){
        int left = n;
        int right = 1000;
        while(left < right){
            int mid = left + (right-left)/2;
            if(isPossible(mid,n,t)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}