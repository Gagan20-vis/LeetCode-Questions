class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 = 3^19 because 3^20 and above that is not in the range of int
        return (n>0 && 1162261467%n == 0);
    }
}