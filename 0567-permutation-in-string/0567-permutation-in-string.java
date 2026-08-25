class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int lenS1 = s1.length();
        int lenS2 = s2.length();
        int left = 0;
        if(lenS1 > lenS2){
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int right = 0 ; right < lenS2 ; right++){
            char ch = s2.charAt(right);
            map2.put(ch, map2.getOrDefault(ch,0)+1);
            if(right - left + 1 > lenS1){
                char chRemove = s2.charAt(left);
                map2.put(chRemove, map2.get(chRemove) - 1);
                if(map2.get(chRemove) == 0){
                    map2.remove(chRemove);
                }
                left++;
            }
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}