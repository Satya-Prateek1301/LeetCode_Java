class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        Deque<int[]> q = new ArrayDeque<>();
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }
                else if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        int min = 0;
        int[] dRow = {-1,1,0,0};
        int[] dCol = {0,0,-1,1};
        while(!q.isEmpty() && fresh>0){
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                int[] curr = q.poll();
                for(int k = 0 ; k < 4 ; k++){
                    int x = curr[0] + dRow[k];
                    int y = curr[1] + dCol[k];
                    if(x>=0 && y >= 0 && x < rows && y < cols && grid[x][y] == 1){
                        fresh--;
                        grid[x][y] = 2;
                        q.add(new int[]{x,y});
                    }
                }
            }
            min++;
        }
        if(fresh == 0){
            return min;
        }
        return -1;
    }
}