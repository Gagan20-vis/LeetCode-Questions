class Solution {
    boolean ispalidrome(int start, int end,String s){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
    void solve(int ind,String s,List<String> temp,List<List<String>> res){
        if(ind==s.length()){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = ind;i<s.length();++i)
        {
            if(ispalidrome(ind,i,s))
            {
                temp.add(s.substring(ind,i+1));
                solve(i+1,s,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        solve(0,s,temp,res);
        return res;
    }
}