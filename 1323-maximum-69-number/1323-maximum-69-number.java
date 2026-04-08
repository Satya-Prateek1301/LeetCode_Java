class Solution {
    public int maximum69Number (int num) {
        char[] digits = String.valueOf(num).toCharArray();

        int left = 0;
        int max = num;

        while (left < digits.length) {

            if (digits[left] == '6') {
                digits[left] = '9';
                break;

                // if (number > max) {
                //     max = number;
                // }
                // digits[left] = '6';
            }
            left++;
        }
                String str = String.valueOf(digits);
                int number = Integer.parseInt(str);
        return number;
        // int[] nums = new int[4];
        // int temp = 0;
        // int i = 0;
        // while(num > 0){
        //     int rem = num % 10;
        //     num /= 10;
        //     arr[i] = rem;
        //     i++;
        // }
    }
}