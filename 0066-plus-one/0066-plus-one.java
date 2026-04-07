class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1 ; i >=0 ; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] res = new int[len + 1];
        res[0] = 1;
        return res;

        // long value = 0;
        // for(int i = 0 ; i < digits.length ; i++){
        //     value = value * 10 + digits[i];
        // }
        // long sum = value + 1;
        // String temp = ""+sum;

        // int lenTemp = temp.length();
        // int[] res = new int[lenTemp];
        
        // for(int i = 0 ; i < lenTemp ; i++){
        //     char ch = temp.charAt(i);
        //     int a = Character.getNumericValue(ch);
        //     res[i] = a;
        // }
        //     return res;
    }
}
