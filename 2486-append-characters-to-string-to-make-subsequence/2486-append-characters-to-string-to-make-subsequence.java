class Solution {
    public int appendCharacters(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        int count=0;
        int count2=0;
        int i = 0;
        int j = 0;
    
        while(i < lenS && j < lenT){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                count++;
            }
            else{
                i++;
            }
                count2=lenT-count;
            
        }
        return count2;
    }
}