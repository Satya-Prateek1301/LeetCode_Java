class Solution {
    public long minCost(String s, int[] cost) {
        long[] arr = new long[26];
        for(int i = 0 ; i < s.length(); i++){
            arr[s.charAt(i) - 'a'] += cost[i];
        }
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0 ; i < 25 ; i++){
            sum += arr[i];
        }
        // long totalValue = 0;

        // for(int i : cost){
        //     totalValue += i; 
        // }

        // long ans = Long.MAX_VALUE;

        // for(int i = 0 ; i < 25 ; i++){
        //     ans = Math.min(ans,totalValue - arr[i]);
        // }

        return sum;
    }
}