class Solution {
    public int minimumDistance(int[] nums) {
        int minDist = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] == nums[j] && nums[j] == nums[k]) {
                        int dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                        if (minDist == -1 || dist < minDist) {
                            minDist = dist;
                        }
                    }
                }
            }
        }
        return minDist;
    }
}