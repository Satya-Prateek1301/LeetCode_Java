class Solution {
    public int minOperations(String s) {
        int start0 = 0;
        int start1 = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            char need0 = (i % 2 == 0) ? '0' : '1'; 
            char need1 = (i % 2 == 0) ? '1' : '0';

            if(ch != need0){
                start0++;
            } 
            if(ch != need1){
                start1++;
            } 
        }

        return Math.min(start0, start1);
    }
}