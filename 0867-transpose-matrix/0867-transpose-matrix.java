class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] arr2 = new int[col][row];
        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < row ; j++){
                arr2[i][j] = matrix[j][i];
            }
        }
        return arr2;
    }
}