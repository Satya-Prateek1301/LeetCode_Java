class Solution {
    public int minimumCost(int[] nums) {
        int x = nums[0];
        Arrays.sort(nums);
        int z = 0;
        int y = 0;
        if(nums[0] == x){
            y = nums[1];
            z = nums[2];
        }
        else if(nums[1] == x){
            y = nums[0];
            z = nums[2];
        }
        else{
            y = nums[0];
            z = nums[1];
        }
        return x+y+z;
    }
}