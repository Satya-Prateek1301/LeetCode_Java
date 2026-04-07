class Solution {

    
    public int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public int digitCount(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public int addDigits(int num) {
        
        if (digitCount(num) == 1) {
            return num;
        }

        int sum = sumOfDigit(num);
        return addDigits(sum);
    }
}
