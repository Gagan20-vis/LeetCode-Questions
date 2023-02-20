class Solution {
    public int findDuplicate(int[] nums) {
        ArrayList<Integer> rep = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            nums[nums[i]%nums.length] += nums.length;
        for(int i = 0;i<nums.length;i++)
            if(nums[i]/nums.length > 1)
                return i;
        return -1;
    }
}