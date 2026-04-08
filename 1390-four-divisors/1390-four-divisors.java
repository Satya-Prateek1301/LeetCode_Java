class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int n : nums) {
            int sum = 0;
            int count = 0;

            for (int i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    int div1 = i;
                    int div2 = n / i;

                    sum += div1;
                    count++;

                    if (div1 != div2) {
                        sum += div2;
                        count++;
                    }
                }

                if (count > 4) break;
            }

            if (count == 4) {
                totalSum += sum;
            }
        }
        return totalSum;
    }
}