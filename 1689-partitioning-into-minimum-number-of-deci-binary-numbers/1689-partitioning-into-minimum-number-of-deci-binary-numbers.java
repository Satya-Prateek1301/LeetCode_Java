class Solution {
    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n.length() ; i++){
            char ch = n.charAt(i);
            max = Math.max(max, ch - '0');
            if(max == 9){
                return 9;
            }
        }
        return max;
    }
}