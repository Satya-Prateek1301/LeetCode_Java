class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n = happiness.length;
        int turn = 0;
        long ans = 0;

        for(int i = n - 1 ; i >= 0 ; i--){
            ans += Math.max((happiness[i] - turn),0);
            turn++;
            if(turn == k){
                break;
            }
        }
        return ans;
    }
}