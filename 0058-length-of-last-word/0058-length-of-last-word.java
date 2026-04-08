class Solution {
    public int lengthOfLastWord(String s) {
        String temp = s.trim();
        int count = 0;
        for(int i = temp.length()-1 ; i >= 0 ; i--){
            char ch = temp.charAt(i);
            if(ch == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}