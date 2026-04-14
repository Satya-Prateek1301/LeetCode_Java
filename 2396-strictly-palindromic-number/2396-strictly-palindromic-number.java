class Solution {
    public String baseConversion(String num, int sbase, int dbase){
        return Integer.toString(Integer.parseInt(num,sbase),dbase);
    }
    public boolean isPalindrome(String num){
        int left = 0;
        int right = num.length() - 1;
        while(left < right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        String num = n+"";
        for(int i = 2 ; i <= n - 2 ; i++){
            int sbase = 10;
            int dbase = i;
            String num1 = baseConversion(num,sbase,dbase);
            boolean res = isPalindrome(num1);
            if(res == false){
                return false;
            }
        }
        return true;
    }
}