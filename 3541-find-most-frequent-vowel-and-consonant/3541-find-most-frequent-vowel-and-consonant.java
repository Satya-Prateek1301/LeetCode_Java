class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        int maxVFreq = 0;
        int maxCFreq = 0;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 0){
                char ch = (char)(i + 'a');
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    int vFreq = freq[i];
                    maxVFreq = Math.max(maxVFreq, vFreq);
                }
                else{
                    int cFreq = freq[i];
                    maxCFreq = Math.max(maxCFreq, cFreq);
                }
            }
        }
        return maxVFreq + maxCFreq;
    }
}