class Solution {
    public int compareBitonicSums(int[] nums) {
        long asc = 0;
        int n = nums.length;
        long total = nums[0];
        int peekidx = 0;
        for(int i = 1; i < n; i++){
            total += nums[i];
            if(nums[i]>nums[i-1]){
                peekidx = i;
            }
        }
        for(int i = 0 ; i <= peekidx ; i++){
            asc += nums[i];
        }
        long desc = total-asc+nums[peekidx];

        if(desc > asc){
            return 1;
        }
        else if(asc > desc){
            return 0;
        }
        else{
            return -1;
        }
    }
}