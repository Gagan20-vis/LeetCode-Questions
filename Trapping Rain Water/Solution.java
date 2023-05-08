class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int l=0,r=n-1;          //Two pointers
        int lMax=0,rMax=0;      //left maximum and right maximum
        long  res = 0;      //result
        while(l<=r){
            if(arr[l]<=arr[r]){
                if(arr[l]>lMax){
                    lMax = arr[l];
                }
                else{
                    res += lMax - arr[l];
                }
                l++;
            }
            else{
                if(arr[r] > rMax){
                    rMax = arr[r];
                }
                else{
                    res += rMax - arr[r];
                }
                r--;
            }
        }
        return (int)res;

    }
}