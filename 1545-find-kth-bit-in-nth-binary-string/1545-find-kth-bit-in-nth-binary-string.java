class Solution {
    public String reverseInvert(String s){
        StringBuilder res = new StringBuilder();
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            char ch = s.charAt(i);

            if(ch == '0'){
                res.append('1');
            }
            else{
                res.append('0');
            }
        }
        return res.toString();
    }
    public char findKthBit(int n, int k) {
        String s = "0";
        String part = "";
        for(int i = 1 ; i <= n ; i++){
            part = s + "1" + reverseInvert(s);
            s = part;
        }
       return s.charAt(k - 1);
    }
}