class Solution {
    public int singleNumber(int[] a) {
        int res = 0;
        for(int i:a)
            res ^= i;
        return res;
    }
}

// 4^1^2^1^2 = 4