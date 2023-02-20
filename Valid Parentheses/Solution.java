class Solution {
    static public boolean match(char a, char b)
    {
        if (a == '(' && b == ')')
        {
            return true;
        }
        if (a == '[' && b == ']')
        {
            return true;
        }
        if (a == '{' && b == '}')
        {
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        if(s.length() <=1)
            return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++)
        {
            char symbol = s.charAt(i);
            if(symbol == '(' || symbol == '[' || symbol == '{')
                st.push(symbol);
            else if(symbol == ')' || symbol == ']' || symbol == '}')
            {
                if(st.size() == 0)
                    return false;
                char popped_ch = st.peek();
                System.out.println(match(symbol,popped_ch));
                if(match(popped_ch,symbol)){
                    st.pop();
                }
                else
                    return false;
            }
        }
        if(st.empty())
            return true;
        else
            return false;
    }
}