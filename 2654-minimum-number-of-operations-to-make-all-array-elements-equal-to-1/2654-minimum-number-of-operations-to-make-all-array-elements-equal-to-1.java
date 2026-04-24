class Solution {
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                count++;
            }
        }
        if(count > 0){
            return n - count;
        }
        int minLength = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int num = nums[i];
            for(int j = i + 1 ; j < n ; j++){
                int gcd1 = gcd(num, nums[j]);
                num = gcd1;
                if(gcd1 == 1){
                    minLength = Math.min(minLength, j - i + 1);
                }
            }

        }
        if(minLength >= Integer.MAX_VALUE){
            return -1;
        }
        return minLength + n - 2;
    }
}