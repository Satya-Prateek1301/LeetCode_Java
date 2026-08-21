class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i < n - 1 ; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1 ; j < n ; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                long newTarget = (long) target - (nums[i] + nums[j]);
                int left = j + 1;
                int right = n - 1;
                while(left < right){
                    long sum = (long) nums[left] + nums[right];
                    if(sum == newTarget){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        while(left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(sum > newTarget){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }
        }
        return res;
    }
}