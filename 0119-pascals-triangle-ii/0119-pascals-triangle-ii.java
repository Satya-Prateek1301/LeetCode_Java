class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        int n = rowIndex + 1;
        for(int i = 0 ; i < n ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || j == i){
                    row.add(1); 
                }
                else{
                    int prev = list.get(i - 1).get(j - 1);
                    int curr = list.get(i - 1).get(j);
                    int sum = prev + curr;
                    row.add(sum);
                }
            }
            list.add(row);
        }
        return list.get(n-1);
    }
}