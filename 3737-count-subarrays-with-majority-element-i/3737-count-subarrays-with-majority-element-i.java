class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        // List<Integer> list = new ArrayList<>(); 
        for(int i = 0 ; i < nums.length ; i++){
            int freqCount = 0;
            for(int j = i ; j < nums.length ; j++){
                if(nums[j] == target){
                    freqCount++;
                }
                else{
                    freqCount--;
                }
                if(freqCount > 0){
                    count++;
                }
            }
        }
        return count;
    }
}