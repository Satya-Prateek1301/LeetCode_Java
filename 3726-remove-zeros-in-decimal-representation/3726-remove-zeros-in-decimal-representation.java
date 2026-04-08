class Solution {
    public long reverse(long rev){
        long temp = rev;
        long newNum = 0;
        while(temp > 0){
            long rem = temp % 10;
            newNum = newNum * 10 + rem;
            temp /= 10;
        }
        return newNum;
    }
    public long removeZeros(long n) {
        long temp = n;
        long rev = 0;
        while(temp > 0){
            long rem = temp % 10;
            if(rem != 0){
                rev = rev * 10 + rem;
            }
            temp /= 10;
        }
        return reverse(rev);
    }
}