class Solution {
    public char toLower(char ch3){
        if((ch3 >= 'A' && ch3 <= 'Z')){
            ch3 = (char)(ch3 + 32);
        }
        return ch3;
    }
    public boolean isPalindrome(String s) {
        // String satya = s;
        int len = s.length();
        int left = 0;
        int right = len - 1;
        while(left < right){
            char leftCh = s.charAt(left);
            char rightCh = s.charAt(right);
            if(!((leftCh >= 'A' && leftCh <= 'Z') || (leftCh >= 'a' && leftCh <= 'z') || (leftCh >= '0' && leftCh <= '9'))){
                left++;
                continue;
            }
            if(!((rightCh >= 'A' && rightCh <= 'Z') || (rightCh >= 'a' && rightCh <= 'z') || (rightCh >= '0' && rightCh <= '9'))){
                right--;
                continue;
            }
            if(toLower(leftCh) != toLower(rightCh)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}