class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid == null || grid.length == 0)
            return 0;
        
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    count++;
                    Queue<int[]> bfs = new LinkedList<>();
                    bfs.add(new int[] {i,j});
                    while(!bfs.isEmpty()){
                      int[] currPos = bfs.poll();
                        for(int[] dir: dirs){
                            int row = dir[0] + currPos[0];
                            int col = dir[1] + currPos[1];
                            if(row >= 0 && row < n &&col >=0 && col< m){
                               if(grid[row][col] == '1')
                                   bfs.add(new int[] {row, col}); 
                                   grid[row][col] = '2';    
                            }
                     
                    }
                    }
                      
                }
        }
    }
        return count;
}
}
