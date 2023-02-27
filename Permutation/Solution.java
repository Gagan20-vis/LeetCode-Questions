class Solution {
    private void solve(int[] arr,List<List<Integer>> ans,int ind)
    {
        if(ind==arr.length)
        {
            List<Integer> ls = new
                    ArrayList<>();
            for(int i =0;i<arr.length;i++)
                ls.add(arr[i]);
            ans.add(new ArrayList<>(ls));
            return ;
        }
        for(int i = ind;i<arr.length;i++)
        {
            swap(i,ind,arr);
            solve(arr,ans,ind+1);
            swap(i,ind,arr);
        }
    }
    private void swap(int i,int j,int[] nums)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        solve(nums,ls,0);
        return ls;
    }
}