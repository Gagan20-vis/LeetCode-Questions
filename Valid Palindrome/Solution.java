class Solution {
    private boolean valid(char t){
        if((t >= 'a' && t<= 'z') || (t>='A' && t<='Z') || (t>='0' && t<='9'))
            return true;
        return false;
    }
    public boolean isPalindrome(String s) {
        String temp = "";

        for(int i=0;i<s.length();i++)
            if(valid(s.charAt(i)))
                temp += s.charAt(i);

        temp = temp.toLowerCase();

        int start = 0;
        int end = temp.length()-1;
        while(start<=end){
            if(temp.charAt(start)!=temp.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}