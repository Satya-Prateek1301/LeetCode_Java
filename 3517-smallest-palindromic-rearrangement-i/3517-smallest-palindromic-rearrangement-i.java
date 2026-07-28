class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                char x = (char) (i + 'a');
                sb.append(x);
            }
        }
        char midChar = 0;
        if(n % 2 != 0){
            for(int i = 0 ; i < 26 ; i++){
                if(freq[i] % 2 != 0){
                    midChar = (char)(i + 'a');
                    break;
                }
            }
        }
        StringBuilder sb1 = new StringBuilder(sb);
        sb1.reverse();
        if(n % 2 != 0){
            return sb.toString() + midChar + sb1.toString();
        }
        System.out.println(sb.toString());
        return sb.toString() + sb1.toString();
    }
}