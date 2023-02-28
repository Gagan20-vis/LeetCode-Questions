class Solution {
    private void solve(int opening,int closing,int n,StringBuilder temp,List<String> ans)
    {
        if(opening==n && closing==n)
        {
            ans.add(temp.toString());
            return ;
        }
        if(opening < n)
        {
            temp.append("(");
            solve(opening+1,closing,n,temp,ans);
            temp.deleteCharAt(temp.length()-1);
        }
        if(closing < opening)
        {
            temp.append(")");
            solve(opening,closing+1,n,temp,ans);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        solve(0,0,n,temp,ans);
        return ans;
    }
}