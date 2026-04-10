class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0;
        int deletion = 0;
        int min = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                deletion++;
                deletion = Math.min(deletion, bCount);
            }
            else{
                bCount++;
            }
        }
        return deletion;
    }
}