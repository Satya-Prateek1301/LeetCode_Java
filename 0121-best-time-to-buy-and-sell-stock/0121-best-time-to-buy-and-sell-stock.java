class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}




// class Solution {
//     public int maxProfit(int[] prices) {
//         int minPrice = prices[0];
//         int minIndex = 0;
//         for (int i = 1; i < prices.length; i++) {
//             minPrice = Math.min(minPrice, prices[i]);
        
//             if (minPrice == prices[i]) {
//                 minIndex = i;
//             }

//         }

//         int maxPrice = prices[minIndex];
        
//         for (int i = minIndex + 1; i < prices.length; i++) {
//             maxPrice = Math.max(maxPrice, prices[i]);
//         }

//         int profit = maxPrice - prices[minIndex];

    
//         if (profit < 0) {
//             return 0;
//         } 
//         return profit;
//     }
// }