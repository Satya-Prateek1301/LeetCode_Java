class Solution {
    public int digSum(int x){
        int sum = 0;
        int prod = 1;
        while(x > 0){
            int rem = x % 10;
            sum += rem;
            x /= 10;
        }
        return sum;
    }
    public int digProd(int x){
        int prod = 1;
        while(x > 0){
            int rem = x % 10;
            prod *= rem;
            x /= 10;
        }
        return prod;
    }
    public boolean checkDivisibility(int n) {
        int digSum = digSum(n);
        int digProd = digProd(n);
        if(n % (digSum + digProd) == 0){
            return true;
        }
        return false;
    }
}