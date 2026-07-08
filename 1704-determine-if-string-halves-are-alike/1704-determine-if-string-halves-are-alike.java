class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0,n/2);
        String b = s.substring(n/2,n);
        String vow = "AEIOUaeiou";
        int aCount = 0;
        int bCount = 0;
        for(int i = 0 ; i < a.length() ; i++){
            char ch = a.charAt(i);
            if(vow.indexOf(ch) != -1){
                aCount++;
            }
        }
        for(int i = 0 ; i < b.length() ; i++){
            char ch = b.charAt(i);
            if(vow.indexOf(ch) != -1){
                bCount++;
            }
        }
        if(aCount == bCount){
            return true;
        }
        return false;
    }
}