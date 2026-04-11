class Solution {
    public boolean checkOnesSegment(String s) {
        for(int i = 1 ; i < s.length() ; i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i - 1);
            if(ch1 != '0' && ch2 == '0'){
                return false;
            }
        }
        return true;
    }
}