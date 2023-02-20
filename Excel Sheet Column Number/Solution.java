class Solution {
    public int titleToNumber(String str) {
        int res = 0,ascii = 0,j = 0;
        for(int i = str.length()-1;i>=0;i--)
        {
            char symbol = str.charAt(i);
            ascii = symbol - 65 + 1;
            int pow = (int)Math.pow(26,j++);
            int temp = ascii * pow;
            res += temp;
        }
        return res;
    }
}