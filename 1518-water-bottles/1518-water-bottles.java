class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = 0;
        int totalDrank = 0;
        while(numBottles > 0){
            totalDrank += numBottles;
            empty += numBottles;
            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }
        return totalDrank;
    }
}