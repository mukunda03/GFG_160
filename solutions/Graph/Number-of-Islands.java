/*
Time Complexity :  O(n*m)
Space Complexity : O(n*m)

linkedIn : www.linkedin.com/in/mukundasv03
Github : https://github.com/mukunda03
*/

class Solution {
    
    static boolean isSafe(char[][] grid, int r, int c, boolean[][] vis){
        int rows = grid.length;
        int cols = grid[0].length;
        return (r >= 0) && (r < rows) && (c >= 0 ) && (c < cols) && (grid[r][c] == 'L' && !vis[r][c]);
    }
    
    static void bfs(char[][] grid, boolean[][] vis, int sr, int sc){
        int[] rNbr = {-1,-1,-1,0,0,1,1,1};
        int[] cNbr = {-1,0,1,-1,1,-1,0,1};
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        vis[sr][sc] = true;
        
        while(!q.isEmpty()){
            int[] pos = q.poll();
            int r = pos[0];
            int c = pos[1];
            
            for(int k =0; k < 8;k++){
                int newR = r+ rNbr[k];
                int newC = c+ cNbr[k];
                if(isSafe(grid, newR, newC, vis)){
                    vis[newR][newC] = true;
                    q.add(new int[]{newR, newC});
                }
            }
        }
    }
    
    public int countIslands(char[][] grid) {
        // Code here
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] vis = new boolean[rows][cols];
        
        int res = 0;
        for(int r = 0; r < rows;r++){
            for(int c = 0 ; c <  cols; c++){
                if(grid[r][c] == 'L' &&  !vis[r][c]){
                    bfs(grid,vis,r,c);
                    res++;
                }
            }
        }
        return res;
    }
}
