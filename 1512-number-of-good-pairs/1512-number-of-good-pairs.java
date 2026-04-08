class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int res = 0;
        int[] freq = new int[101];

        for(int i = 0 ; i < nums.length ; i++){
            freq[nums[i]]++;
        }
        for(int count : freq){
            count = (count * (count - 1))/2;
            res += count;
        }
        return res;
    }
}