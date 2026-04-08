class Solution {
    public int differenceOfSum(int[] nums) {

        int sum = 0;
        int sumDigit = 0;

        for(int num : nums){
            sum += num;
        }
        
        for(int i = 0 ; i < nums.length ; i++){
                int n = nums[i];
                while(n > 0){
                    int rem = n % 10;
                    sumDigit = sumDigit + rem;
                    n /= 10;
                }
        }

        return Math.abs(sum - sumDigit); 
    }
}