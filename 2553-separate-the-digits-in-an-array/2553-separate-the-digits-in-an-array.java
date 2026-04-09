class Solution {
    public int[] separateDigits(int[] nums) {
        int count = 0;
        for(int i : nums){
            while(i != 0){
                // int rem = nums[i] % 10;
                count++;
                i /= 10;
            }
        }

        int[] arr = new int[count];

        for(int i = nums.length - 1 ; i >= 0 ; i--){
            int x = nums[i];
            while(x != 0){
                arr[count - 1]= x % 10;
                count--;
                x /= 10;
            }
        }
        return arr;
    }
}