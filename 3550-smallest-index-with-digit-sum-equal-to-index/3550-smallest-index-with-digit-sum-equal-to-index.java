class Solution {
    public int sum(int temp){
        int sum = 0;
        while(temp > 0){
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int temp=nums[i];
            sum = sum(temp);
            if(i==sum){
                return i;
            }
        }
        return -1;
    }
}