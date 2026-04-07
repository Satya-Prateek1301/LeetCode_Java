class Solution {
    public void reverseString(char[] s) {
        int lenS = s.length;
        int i = 0;
        int j = lenS-1;
        while(j >= i){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }

        // StringBuilder rev = new StringBuilder();
        // for(int i = s.length - 1 ; i >= 0 ; i--){
        //     rev.append(s[i]);
        // }
        // for (int i = 0; i < s.length; i++) {
        //     s[i] = rev.charAt(i);
        // }
    }
}