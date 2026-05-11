class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(k < spaces.length && i == spaces[k]){
                sb.append(" ");
                k++;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}