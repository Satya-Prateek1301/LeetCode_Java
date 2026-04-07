class Solution {
    public int alternateDigitSum(int n) {
        int i = 0;
        int rem;
        int rev = 0;
        while(n!=0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        int temp = rev;
        int rev1 = 0;
        int sum = 0;
        while(temp!=0){
            
            int rem1 = temp % 10;
            temp /= 10;
            if(i%2==0){
                sum += rem1;
                i++;
            }
            else{
                sum -= rem1;
                i++;
            }
        }
        return sum;
    }
}