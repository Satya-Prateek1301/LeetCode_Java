class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] alpha = new char[26];
        char ele = 'a';
        for(int i = 0 ; i < 26 ; i++){
            alpha[i] = ele;
            ele++;
        }
        String str = "";
        int sum = 0;
        for(int i : shifts){
            sum = (sum + i) % 26;
        }
        for(int i = 0 ; i < shifts.length ; i++){
            char ch = s.charAt(i);
            int pos = ch - 'a';
            pos = (pos + sum) % 26;
            str += alpha[pos];
            sum -= shifts[i] % 26;
            if(sum < 0){
                sum += 26;
            }
        }
        return str;
    }
}