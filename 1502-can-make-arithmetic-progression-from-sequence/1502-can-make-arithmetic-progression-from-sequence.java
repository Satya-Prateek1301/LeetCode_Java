class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);
        int len = arr.length;
        int diff = arr[1] - arr[0];
        int diff1;
        for(int i = 1 ; i < len ; i++){
            diff1 = arr[i] - arr[i - 1];
            if(diff != diff1){
                return false;
            }
        }
        return true;
    }
}