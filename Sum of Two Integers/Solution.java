class Solution {
    public int getSum(int a, int b) {
        int mask = 0xFFFFFFFF;
        while(b!=0){
            int carry = (a&b) & mask;
            a = (a ^ b) & mask;
            b = (carry << 1) & mask;
        }
        return a;
    }
}