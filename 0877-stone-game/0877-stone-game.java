class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += piles[i];
            } else {
                oddSum += piles[i];
            }
        }
        if(evenSum != oddSum){
            return true
            ;
        }
        return false;
    }
}