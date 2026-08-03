class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int x = n*m;
        int l = 0;
        int r = x - 1;
        while(l<=r){
            int mid = l+(r-l)/2;
            int rIdx = mid/m;
            int cIdx = mid%m;
            if(mat[rIdx][cIdx] == target){
                return true;
            }else if(target < mat[rIdx][cIdx]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return false;
    }
}