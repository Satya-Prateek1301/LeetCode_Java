class Solution {
    public int[] runningSum(int[] nums) {
        // ArrayList <Integer> list = new ArrayList<>();
        int[] result = new int[nums.length];
        result[0] = nums[0];
        // int prevSum = 0;
        // int curSum = 0;

        // for(int i = 0 ; i < nums.length ; i++){
        //     curSum = nums[i] + prevSum;
        //     list.add(curSum);
        //     prevSum = curSum;
        // }

        // for(int i = 0 ; i < nums.length ; i++){
        //     result[i] = list.get(i);
        // }

        for(int i = 1 ; i < nums.length ; i++){
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}