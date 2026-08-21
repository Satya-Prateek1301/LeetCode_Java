class Solution {
    public boolean isPalindrome(String str){
        int n = str.length();
        int left = 0;
        int right = n - 1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        List<String> list = new ArrayList<>();
        int count = 0;
        String str = "";
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i + 1 ; j <= s.length() ; j++){
                list.add(s.substring(i,j));
            }
        }
        for(String str1 : list){
            if(isPalindrome(str1)){
                count++;
            }
        }
        return count;
    }
}