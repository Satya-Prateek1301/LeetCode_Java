class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < mat.length ; i++){
            int count = 0;
            for(int j = 0 ; j < mat[i].length ; j++){
                if(mat[i][j] == 1){
                    count++;
                }
                else{
                    break;
                }
            }
            map.put(i,count);
        }
        List<Integer> rows = new ArrayList<>(map.keySet());
        Collections.sort(rows,(a,b) ->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(a) - map.get(b);
            }
            else{
                return a - b;
            }
        });

        int[] res = new int[k];
        for(int i = 0 ; i < k ; i++){
            res[i] = rows.get(i);
        }
        return res;
    }
}