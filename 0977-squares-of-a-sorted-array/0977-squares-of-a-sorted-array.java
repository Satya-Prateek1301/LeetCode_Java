class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0 ;  i < nums.length ; i++){
            int x = (int)Math.pow(nums[i],2);
            res[i] = x;
        }
       Arrays.sort(res);
       return res;
    }
}