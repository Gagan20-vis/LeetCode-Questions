class Solution {
    public:
    void solve(string digits,vector<string>& ans,string mpp[],string output,int index){
        if(index>=digits.length()){
            ans.push_back(output);
            return ;
        }
        int number = digits[index] - '0';
        string value = mpp[number];

        for(int i=0;i<value.length();i++){
            output.push_back(value[i]);
            solve(digits,ans,mpp,output,index+1);
            output.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        vector<string> ans ;

        if(digits.length()==0)
            return ans;
        string mpp[10] = {"","","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        string output;
        int index = 0;
        solve(digits,ans,mpp,output,index);
        return ans;
    }
};