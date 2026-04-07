class Solution {
    public boolean isPalindrome(String s) {
        int lenS = s.length();
        int left = 0;
        int right = lenS - 1;

        while( left < right){
            char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);
            // Character.toLowerCase(ch1);
            // Character.toLowerCase(ch2);
            if(!Character.isLetterOrDigit(ch1)){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(ch2)){
                right--;
                continue;
            }
            if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2)){
                return false;
            }
                left++;
                right--;
            }
        return true;
        }
    }
