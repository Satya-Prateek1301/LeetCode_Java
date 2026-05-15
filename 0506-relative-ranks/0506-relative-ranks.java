class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sorted = score.clone();
        int n = score.length;
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = n - 1; i >= 0; i--){
            map.put(sorted[i],rank++);
        }
        String[] res = new String[n];
        for(int i = 0 ; i < n ; i++){
            int r = map.get(score[i]);
            if(r == 1){
                res[i] = "Gold Medal";
            }
            else if(r == 2){
                res[i] = "Silver Medal";
            }
            else if(r == 3){
                res[i] = "Bronze Medal";
            }
            else{
                res[i] = Integer.toString(r);
            }
        }
        return res;
    }
}