class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int result;
        int temp = x;
        while(x>0){
            int rem = x % 10;
            sum += rem;
            x /= 10;
        }
        if(temp%sum==0){
            result = sum;
            return result;
        }
        else{
            return -1;
        }
    }
}