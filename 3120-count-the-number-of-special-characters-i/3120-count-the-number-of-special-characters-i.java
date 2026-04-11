class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        for(Character key : map.keySet()){
            if(Character.isLowerCase(key) && map.containsKey(Character.toUpperCase(key))){
                count++;
            }
        }
        return count;
    }
}