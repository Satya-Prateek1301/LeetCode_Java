class Solution {
    public String reverseWords(String s) {
        
        String newSen = "";
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word += ch;
            } 
            else {
                if (!word.equals("")) {
                    newSen = word + " " + newSen;
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            newSen = word + " " + newSen;
        }

        return newSen.trim();
    }
}
