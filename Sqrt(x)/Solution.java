class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int low = 1;
        int high = x;
        int mid = 0;
        int ans = -1;

        while(low<=high)
        {
            mid = (low+high)/2;
            if(x/mid == mid)
                return mid;
            if(x/mid < mid)
                high = mid-1;
            else
            {
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }
}