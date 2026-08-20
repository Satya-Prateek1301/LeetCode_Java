class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2];
        for (int s1 = 0, s2 = s1 + 1, s3 = n - 1; s1 < n - 2;) {
            int sum = nums[s1] + nums[s2] + nums[s3];
            if(sum == target){
                return sum;
            }
            if(sum < target){
                s2++;
            }
            else{
                s3--;
            }
            if(Math.abs(sum - target) < Math.abs(closest - target)){
                closest = sum;
            }
            if(s2 >= s3){
                s1++;
                s2 = s1 + 1;
                s3 = n - 1;
            }
        }
        return closest;
    }
}