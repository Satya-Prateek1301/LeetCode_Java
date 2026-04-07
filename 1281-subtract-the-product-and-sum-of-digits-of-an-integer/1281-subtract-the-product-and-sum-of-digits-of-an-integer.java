class Solution {
    public int subtractProductAndSum(int n) {
        int rev = 0;
        int sum = 0 ;
        int product = 1;
        // int diff;
        while(n>0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        
        // diff = product - sum;
        
        return product - sum;
    }
}