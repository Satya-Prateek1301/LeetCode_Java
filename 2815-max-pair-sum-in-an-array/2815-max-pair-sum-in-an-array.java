class Solution {
    private int digLargest(int num){
        int max = Integer.MIN_VALUE;
        while(num > 0){
            int rem = num % 10;
            max = Math.max(max, rem);
            num /= 10;
        }
        return max;
    }
    public int maxSum(int[] nums) {
        int ans = -1;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(digLargest(nums[i]) == digLargest(nums[j])){
                    ans = Math.max(ans,nums[i]+nums[j]);
                }
            }
        }
        return ans;
    }
}