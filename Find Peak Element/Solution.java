class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        int s = 0, e = nums.length-1;
        while(s<e)
        {
            int mid = (s+e)/2;
            if(nums[mid]<nums[mid+1]) s = mid+1;
            else e = mid;
        }
        return s;
    }
}