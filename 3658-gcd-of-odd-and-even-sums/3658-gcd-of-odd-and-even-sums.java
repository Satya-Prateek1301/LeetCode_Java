class Solution {
    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,(a % b));
    }
    public int gcdOfOddEvenSums(int n) {
        int evenSum = 0;
        int oddSum = 0;
        int eNum = 2;
        int oNum = 1;
        for(int i = 0 ; i < n ; i++){
            evenSum += eNum;
            eNum += 2;
        }
        for(int i = 0 ; i < n ; i++){
            oddSum += oNum;
            oNum += 2;
        }
        return gcd(oddSum, evenSum);
    }
}