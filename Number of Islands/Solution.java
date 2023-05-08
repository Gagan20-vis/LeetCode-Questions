class Solution {
    private void solve(char[][] grid,int m,int n,int x,int y){
        if(x<0 || x>=m || y < 0 || y >= n || grid[x][y]!='1') return;
        grid[x][y] = '2';
        solve(grid,m,n,x-1,y);
        solve(grid,m,n,x+1,y);
        solve(grid,m,n,x,y-1);
        solve(grid,m,n,x,y+1);
    }
    public int numIslands(char[][] grid) {
        try{int m = grid.length,n = grid[0].length,ans=0;
            for(int i = 0;i<m;i++)
                for(int j = 0;j<n;j++)
                    if(grid[i][j]=='1'){
                        solve(grid,m,n,i,j);
                        ans++;
                    }
            return ans;}finally{System.gc();}
    }
}