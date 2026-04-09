class Solution {

    public String reverseString(String word, int k){
        String rev ="";
        for(int  i = k; i >= 0 ; i--){
            char ch = word.charAt(i);
            rev += ch;
        }
        return rev;
    }

    public String reversePrefix(String word, char ch) {
        int k = word.indexOf(ch);
        if(k == -1){
            return word;
        }
        return reverseString(word,k) + word.substring(k + 1);
    }
}