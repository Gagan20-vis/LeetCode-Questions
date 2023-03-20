class Solution {
    public double myPow(double N, int R) {
        long mod = 1000000007;
        if(R==1) return N;
        double x = myPow(N,R/2);
        x = (x*x)%mod;
        if(R%2 != 0) return (N*x)%mod;
        else return x%mod;
    }
}