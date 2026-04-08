class Solution {
    public int maximumProduct(int[] nums) {
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
        
        
        
        // Arrays.sort(nums);
        // int n = nums.length;
        
        // int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        // int product2 = nums[0] * nums[1] * nums[n - 1];

        // return Math.max(product1, product2);
        
        // int len = nums.length;
        // int prod = 1;
        // if(len <= 3){
        //     for(int i = 0 ; i < len ; i++){
        //         prod *= nums[i];
        //     }
        // }
        // else {
        //     for(int i = len - 1 ; i >= len - 3 ; i--){
        //         prod *= nums[i];
        //     }
        // }

        // return prod;
    }
}