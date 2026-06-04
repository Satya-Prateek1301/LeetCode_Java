class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowMin = new int[m];
        int[] colMax = new int[n];
        for(int i = 0 ; i < m ; i++){
            rowMin[i] = Integer.MAX_VALUE;
            for(int j = 0 ; j < n ; j++){
                rowMin[i] = Math.min(rowMin[i],matrix[i][j]);
            }
        }
        for(int j = 0 ; j < n ; j++){
            colMax[j] = Integer.MIN_VALUE;
            for(int i = 0 ; i < m ; i++){
                colMax[j] = Math.max(colMax[j],matrix[i][j]);
            } 
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}