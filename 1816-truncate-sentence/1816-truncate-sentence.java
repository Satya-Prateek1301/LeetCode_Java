class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }
            if(ch == ' '){
                sb.append(' ');
                count++;
                if(count == k){
                    break;
                }
            }
        }
        return sb.toString().trim();
    }
}