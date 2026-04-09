class Solution {
    public String convertToTitle(int columnNumber) {
        String res ="";
        int n = columnNumber;
        while(n > 0){
            n--;
            int rem = n % 26;
            char ch = (char)('A'+rem);
            res = ch + res;
            n /= 26;
        }
        return res;
    }
}