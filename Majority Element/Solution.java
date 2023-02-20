class Solution {
    public int majorityElement(int[] nums) {
        int ma = nums[0];
        int size = nums.length;
        int count=1;
        int div = size/2;
        for(int i=1;i<size;i++){
            if(nums[i]==ma) count++;
            else count--;
            if(count==0){
                ma = nums[i];
                count=1;
            }
        }
        int c=0;
        for(int i=0;i<size;i++)
            if(nums[i]==ma) c++;
        if(c>div)
            return ma;
        else
            return -1;
    }
}