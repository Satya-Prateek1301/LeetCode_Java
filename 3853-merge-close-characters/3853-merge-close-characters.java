class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(true) {
            int removeIdx = -1;

            for(int i = 0 ; i < sb.length() ; i++){
                for(int j = i + 1 ; j < sb.length() ; j++){
                    if(sb.charAt(i) == sb.charAt(j) && j - i <= k){
                        removeIdx = j;
                        break;
                    }
                }
                if(removeIdx != -1){
                    break;
                }
            }
            if(removeIdx == -1){
                break;
            }
            sb.deleteCharAt(removeIdx);
        }
        return sb.toString();
    }
}