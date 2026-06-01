class Solution {
    public int minPatches(int[] nums, int n) {
        long sumForm = 0;
        long sumExp = 1;
        int patches = 0;
        int m = nums.length;
        int i = 0;
        while(sumForm < n){
            if(sumForm >= sumExp){
                sumExp = sumForm + 1;
            }
            else{
                if(i < m && nums[i] <= sumExp){
                    sumForm += nums[i];
                    i++;
                }
                else{
                    sumForm += sumExp;
                    patches++;
                }
            }
        }
        return patches;
    }
}