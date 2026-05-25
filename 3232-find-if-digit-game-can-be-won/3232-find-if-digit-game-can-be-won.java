class Solution {
    public boolean canAliceWin(int[] nums) {
        int sCount = 0;
        int dCount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < 10){
                sCount += nums[i];
            }
            else{
                dCount += nums[i];
            }
        }
        if(sCount != dCount){
            return true;
        }
        return false;
    }
}