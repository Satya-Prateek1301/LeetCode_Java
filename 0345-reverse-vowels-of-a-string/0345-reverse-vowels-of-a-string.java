class Solution {
    boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
}
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vow = "aeiouAEIOU";
        int left = 0;
        int right = s.length() - 1;
        char temp;
        while(left < right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }

            else{
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } 
        }
        return new String (arr);
    }
}