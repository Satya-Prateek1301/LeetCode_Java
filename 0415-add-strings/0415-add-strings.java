class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){
            int d1 = (i >= 0)?num1.charAt(i) - '0' : 0;
            int d2 = (j >= 0)?num2.charAt(j) - '0' : 0;

            int sum = d1 + d2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}


    // public long stringToInteger(String s){
    //     long num = 0;
    //     for(int i = 0 ; i < s.length() ; i++){
    //         num = num * 10 +(s.charAt(i) - '0');
    //     }
    //     return num;
    // }

    // public String addStrings(String num1, String num2) {
    //     long dig1 = stringToInteger(num1);
    //     long dig2 = stringToInteger(num2);
    //     long sum = dig1 + dig2;

    //     return sum+"";
    // }
// }