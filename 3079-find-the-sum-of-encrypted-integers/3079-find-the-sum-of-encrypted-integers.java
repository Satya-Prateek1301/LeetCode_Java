class Solution {
    public int digCount(int x){
        if(x == 0) return 1;
        int count = 0;
        while(x > 0){
            x /= 10;
            count++;
        }
        return count;
    }
    public int largestDig(int x){
        int max = 0;
        while(x > 0){
            int rem = x % 10;  
            max = Math.max(max, rem);
            x /= 10;
        }
        return max;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sumDig = 0;
        int len = nums.length;
        
        for(int i : nums){
            int x = i;
            int count = digCount(x);
            int maxDig = largestDig(x);
            int encrypted = 0;
            for(int j = 0; j < count; j++){
                encrypted = encrypted * 10 + maxDig;
            }
            sumDig += encrypted;
        }
        return sumDig;
    }
}