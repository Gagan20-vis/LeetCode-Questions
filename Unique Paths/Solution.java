class Solution {
    //Recursion (Throwing TLE)
    // private int solve(int i,int j,int m,int n)
    // {
    //     if(i==(n-1) && j==(m-1)) return 1;
    //     if(i>=n || j>=m) return 0;
    //     else return solve(i+1,j,m,n) + solve(i,j+1,m,n);
    // }

    public int uniquePaths(int m, int n) {
        int N = n+m-2, r = m-1;
        double res = 1;

        for(int i = 1;i<=r;i++)
            res = res * (N-r+i)/i;
        return (int) res;
    }
}