class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(i == 0 || i == n - 1){
                res.add(nums[i]);
                continue;
            }
            boolean leftMax = true;
            for(int j = 0 ; j < i ; j++){
                if(nums[i] <= nums[j]){
                    leftMax = false;
                    break;
                }
            }
            boolean rightMax = true;
            for(int j = i + 1 ; j < n ; j++){
                if(nums[i] <= nums[j]){
                    rightMax = false;
                    break;
                }
            }
            if(leftMax || rightMax){
                res.add(nums[i]);
            }
        }
        return res;
    }
}