class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = -1 , maxIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                return -1;
            }
        }
        
        return maxIndex;

        // if(h1 >= 2*h2){
        //     return indexOf(h1);
        // }
        // else{
        //     return -1;
        // }
    }
}