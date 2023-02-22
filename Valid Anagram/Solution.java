class Solution {
    public boolean isAnagram(String s, String t) {
        //Brute force

        // if(s.length() != t.length())
        //     return false;
        // char[] x = s.toCharArray();
        // char[] y = t.toCharArray();
        // Arrays.sort(x);
        // Arrays.sort(y);
        // for(int i = 0;i<x.length;i++)
        //     if(x[i] != y[i])
        //         return false;
        // return true;

        //Optimal

        if(s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for(char x: s.toCharArray()) freq[x-'a']++;
        for(char x: t.toCharArray()){
            freq[x-'a']--;
            if(freq[x-'a']<0)
                return false;
        }
        return true;
    }
}