class Solution {
    public int residuePrefixes(String s) {
        int lenS = s.length(); 
        int count = 0;
        int[] freq = new int[26];
        int distinct = 0;
        for(int i = 0 ; i < lenS ; i++){
            int idx = s.charAt(i) - 'a';
            if(freq[idx] == 0){
                distinct++;
            }
            freq[idx]++;
        
            int prefixLen = i + 1;
            if(distinct == (prefixLen%3)){
                count++;
            }
        }
        return count;
    }
}