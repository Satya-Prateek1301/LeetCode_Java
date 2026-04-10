class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            int totalWeight = 0;
            for(char c : word.toCharArray()){
                totalWeight += weights[c - 'a'];
            }
            int mod = totalWeight % 26;
            char mappedChar = (char)('z' - mod);
            sb.append(mappedChar);
        }
        return sb.toString();
    }
}