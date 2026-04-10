class Solution {
    public boolean isSameFreq(int[] freq){
        int count = 0;
        for(int i : freq){
            if(i == 0){
                continue;
            }
            if(count == 0){
                count = i;
            }
            else if(i != count){
                return false;
            }
        }
        return true;
    }
    public int longestBalanced(String s) {
        int max = Integer.MIN_VALUE;
        int len = s.length();
        for(int i = 0 ; i < len ; i++){
            int[] freq = new int[26];
            for(int j = i ; j < len ; j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                if(isSameFreq(freq)){
                    max = Math.max(max,j - i + 1);
                }
            }
        }
        return max;
    }
}