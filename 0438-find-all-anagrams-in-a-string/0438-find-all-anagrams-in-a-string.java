class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int lenS = s.length();
        int lenP = p.length();
        int left = 0;
        List<Integer> list = new ArrayList<>();
        if(lenS < lenP){
            return list;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch : p.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        Map<Character, Integer> map2 = new HashMap<>();
        for(int right = 0 ; right < lenS ; right++){
            char ch = s.charAt(right);
            map2.put(ch,map2.getOrDefault(ch, 0) + 1);
            if(right - left + 1 > lenP){
                char chRemove = s.charAt(left);
                map2.put(chRemove, map2.get(chRemove) - 1);
                if(map2.get(chRemove) == 0){
                    map2.remove(chRemove);
                }
                left++;
            }
            if(map1.equals(map2)){
                list.add(left);
            }
        }
        return list;
    }
}