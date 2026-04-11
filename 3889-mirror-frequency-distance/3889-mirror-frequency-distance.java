class Solution {
    public int mirrorFrequency(String s) {
        int[] letters = new int[26];
        int[] digits = new int[10];

        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                letters[ch - 'a']++;
            }
            else{
                digits[ch - '0']++;
            }
        }
        int sum = 0;
        for(int i = 0 ; i < 13 ; i++){
            sum += Math.abs(letters[i] - letters[25 - i]);
        }
        for(int i = 0 ; i < 5 ; i++){
            sum += Math.abs(digits[i] - digits[9 - i]);
        }
        return sum;
    }
}