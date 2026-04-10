import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums); 

        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int need = -nums[i] - nums[j];

                if (set.contains(need)) {
                    result.add(Arrays.asList(nums[i], need, nums[j]));
                }

                set.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}