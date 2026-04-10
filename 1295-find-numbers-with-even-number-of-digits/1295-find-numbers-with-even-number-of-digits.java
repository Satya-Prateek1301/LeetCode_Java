class Solution {
    public  boolean evenCount(int num){
        int count = 0;
        
        boolean flag = false;
        while(num != 0){
            num /= 10;
            count++;
        }
        if(count % 2 == 0){
            flag = true;
        }
        return flag;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i= 0 ; i < nums.length ; i++){
            int x = nums[i];
            if(evenCount(x)){
                count++;
            }
        }
        return count;
    }
}