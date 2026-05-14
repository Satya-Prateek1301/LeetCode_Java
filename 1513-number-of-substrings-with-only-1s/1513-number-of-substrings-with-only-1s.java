class Solution {
    public int numSub(String s) {
        long mod = 1000000007;
        long count1 = 0;
        long sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                count1++;
            }
            else{
                sum = (sum + count1 * (count1 + 1) / 2) % mod;
                count1 = 0;
            }
        }
        sum = (sum + count1 * (count1 + 1) / 2) % mod;
        return (int)sum;
    }
}