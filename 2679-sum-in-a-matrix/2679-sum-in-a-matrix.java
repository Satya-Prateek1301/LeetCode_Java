class Solution {
    public int matrixSum(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        for(int i = 0 ; i < n ; i++){
            Arrays.sort(nums[i]);
        }
        int score = 0;
        for(int col = m - 1 ; col >= 0 ; col--){
            int max = 0;
            for(int rows = 0 ; rows < n ; rows++){
                max = Math.max(max,nums[rows][col]);
            }
            score += max;
        }
        return score;
    }
}