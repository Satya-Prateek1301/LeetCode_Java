class Solution {
    public long reverse(long num){
        long rev = 0;
        while(num != 0){
            long rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        long og = num;
        long rev1 = reverse(num);
        long rev2 = reverse(rev1);
        if(rev2 > Integer.MAX_VALUE || rev2 < Integer.MIN_VALUE){
            return false;
        }
        if(rev2 == og){
            return true;
        }
        return false;
    }
}