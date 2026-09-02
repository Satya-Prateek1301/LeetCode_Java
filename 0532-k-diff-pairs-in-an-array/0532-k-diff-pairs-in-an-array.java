class Solution {

    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        int count = 0;
        while (i < n && j < n) {
            if (i == j) {
                j++;
                continue;
            }
            int diff = nums[j] - nums[i];
            if (diff < k) {
                j++;
            }
            else if (diff > k) {
                i++;
            }
            else {
                count++;
                int x = nums[i];
                int y = nums[j];
                while (i < n && nums[i] == x) {
                    i++;
                }
                while (j < n && nums[j] == y) {
                    j++;
                }
            }
        }
        return count;
    }
}