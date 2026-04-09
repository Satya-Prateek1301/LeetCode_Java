class Solution {
    public int longestContinuousSubstring(String s) {
        int len = s.length();
        int max = 1;
        int count = 1;
        for(int i = 0 ; i < len - 1 ; i++){
            if(s.charAt(i + 1) - s.charAt(i) == 1){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}