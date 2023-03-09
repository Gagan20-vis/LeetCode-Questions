class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int natural_sum = 0;
        natural_sum = (nums.length*(nums.length+1)/2);
        for(int i :nums)
            sum += i;
        return natural_sum - sum;

    }
}