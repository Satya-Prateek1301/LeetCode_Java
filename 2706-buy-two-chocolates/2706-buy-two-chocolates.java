class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices.length;
        int firH = prices[0];
        int secH = prices[1];

        int sum = firH + secH;

        int res;
        if(sum <= money){
            res = money - sum;
        }
        else{
            res = money;
        }
        return res;
    }
}