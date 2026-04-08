class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinctCount = 1;
        int len = nums.length;
        
        for(int i = len - 1 ; i > 0 ; i--){
            if(nums[i] != nums[i - 1]){
                distinctCount++;
            }
            if(distinctCount == 3){
                return nums[i - 1];
            }
        }
        return nums[len - 1];
    }
}