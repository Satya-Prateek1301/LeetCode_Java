class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        
        int min1_1 = Integer.MAX_VALUE;
        int min2_1 = Integer.MAX_VALUE;

    
        int min1_2 = Integer.MAX_VALUE;
        int min2_2 = Integer.MAX_VALUE;

        for (int num : nums) {
            sum += num;
            int r = num % 3;

            if (r == 1) {
                if (num < min1_1) {
                    min2_1 = min1_1;
                    min1_1 = num;
                } else if (num < min2_1) {
                    min2_1 = num;
                }
            }

            else if (r == 2) {
                if (num < min1_2) {
                    min2_2 = min1_2;
                    min1_2 = num;
                } else if (num < min2_2) {
                    min2_2 = num;
                }
            }
        }

        if (sum % 3 == 0) return sum;

        int remainder = sum % 3;

        if (remainder == 1) {
            int option1 = min1_1;
            int option2 = (min1_2 == Integer.MAX_VALUE || min2_2 == Integer.MAX_VALUE)
                    ? Integer.MAX_VALUE
                    : min1_2 + min2_2;

            int res = sum - Math.min(option1, option2);
            return res < 0 ? 0 : res;
        }

        else { 
            int option1 = min1_2;
            int option2 = (min1_1 == Integer.MAX_VALUE || min2_1 == Integer.MAX_VALUE)
                    ? Integer.MAX_VALUE
                    : min1_1 + min2_1;

            int res = sum - Math.min(option1, option2);
            return res < 0 ? 0 : res;
        }
    }
}
