class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int sell = 0;

        for (int i = 1; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                sell += prices[i] - minPrice;
                minPrice = prices[i];
            }

        }
        return sell;
    }
}