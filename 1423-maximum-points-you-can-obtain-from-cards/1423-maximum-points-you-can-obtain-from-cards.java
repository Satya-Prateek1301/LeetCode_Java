class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int left = k - 1;
        int leftSum = 0;
        for(int i = 0 ; i < k ; i++){
            leftSum += cardPoints[i];
        }
        max = leftSum;
        for(int right = n - 1; right >= n - k ; right--){
            sum += cardPoints[right];
            leftSum -= cardPoints[left];
            max = Math.max(max, leftSum + sum);
            left--;
        }
        return max;
    }
}