class Solution {
    private void solve(int ind, int[] nums,List<List<Integer>> ans,ArrayList<Integer> temp){
        if(ind == nums.length)
        {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[ind]);
        solve(ind+1,nums,ans,temp);
        temp.remove(temp.size() - 1);
        solve(ind+1,nums,ans,temp);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        solve(0,nums,ans,temp);
        return ans;
    }
}