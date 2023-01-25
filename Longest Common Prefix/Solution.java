class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        int i = 0,j = 0, n = arr.length;
        String res = "";
        
        while(i<(arr[0]).length() && j < (arr[n-1]).length())
        {
            if(arr[0].charAt(i) != arr[n-1].charAt(i))
                break;
            res += arr[0].charAt(i);
            i++;j++;
        }
    }
}