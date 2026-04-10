class Solution {
    public int prefixConnected(String[] words, int k) {
        String[] str = new String[words.length];
        for(int i = 0 ; i < words.length ; i++){
            str[i] = words[i];
        }

        Map<String,Integer> map = new HashMap<>();

        for(String word : str){
            if(word.length() < k){
                continue;
            }
            String prefix = word.substring(0,k);
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }

        int comb = 0;
        for(int count : map.values()){
            if(count >= 2){
                comb++;
            }
        }
        return comb;
    }
}