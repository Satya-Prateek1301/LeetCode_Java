class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        
        int repeated = freq[s.charAt(0) - 'a'];

        for (int i = 0; i < 26; i++) {
            System.out.println(i + " : " + freq[i]);
            if (freq[i] != 0 && freq[i] != repeated) {
                return false;
            }
        }
        
        return true;
    }
}