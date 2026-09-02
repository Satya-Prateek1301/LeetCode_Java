class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            int target = k + nums[i];
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int idx = Arrays.binarySearch(nums, i+1, n, target);
            if(idx >= 0){
                count++;
            }
        }
        return count;
    }
}