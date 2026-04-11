class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                map.put(ch,i);
            } 
            else {
                char lower = Character.toLowerCase(ch);
                if(!map.containsKey(ch)){
                    map.put(ch,i);
                }
            }
        }
        int count = 0;
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            char upper = Character.toUpperCase(ch);
            if (map.containsKey(ch) && map.containsKey(upper) &&
                map.get(ch) < map.get(upper)) {
                count++;
            }
        }
        return count;
    }
}