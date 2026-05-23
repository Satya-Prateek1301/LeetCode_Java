class Solution {
    public int minOperations(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        for(int x = 0; x < k; x++){
            for(int y = 0 ; y < k ; y++){
                if(x == y){
                    continue;
                }
                int operations = 0;
                for(int i = 0; i < nums.length; i++){
                    int target;
                    if(i % 2 == 0){
                        target = x;
                    }
                    else{
                        target = y;
                    }
                    int rem = nums[i] % k;
                    int diff = Math.abs(rem - target);
                    operations += Math.min(diff, k - diff);
                }
                res = Math.min(res, operations);
            }
        }
        return res;
    }
}