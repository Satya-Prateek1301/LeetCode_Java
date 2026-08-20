class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = i + 2;
            while (j < n - 1) {
                if (k < n && nums[i] + nums[j] > nums[k]) {
                    k++;
                } else {
                    ans += k - j - 1;
                    j++;
                    if (k <= j) {
                        k = j + 1;
                    }
                }
            }
        }
        return ans;
    }
}