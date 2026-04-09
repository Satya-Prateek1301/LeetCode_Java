class Solution {
    public int reverseDegree(String s) {
        int len = s.length();
        int res = 0;
        for(int i = 0 ; i < len ; i++){
            int key = (26 - (s.charAt(i) - 'a'));
            int prod = key * (i + 1);
            res += prod;
        }
        return res;
    }
}