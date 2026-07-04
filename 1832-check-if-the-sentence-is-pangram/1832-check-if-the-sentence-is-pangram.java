class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freq = new int[26];
        for(int i = 0 ; i < sentence.length() ; i++){
            char ch = sentence.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i : freq){
            System.out.print(i + " ");
        }
        boolean flag = false;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] > 0){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            return true;
        }
        return false;
    }
}