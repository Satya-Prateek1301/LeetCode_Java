class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int left = 0;
        int right = len - 1;

        if(letters[left] > target || letters[right] <= target){
            return letters[0];
        }
        while(left < right){
            int mid = left + (right - left)/2;
            if(letters[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return letters[right] > target ? letters[right] : letters[right + 1];
    }
}