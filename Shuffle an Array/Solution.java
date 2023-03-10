class Solution {

    private static int[] arr;
    private Random random;

    public Solution(int[] nums) {
        arr = nums;
        random = new Random();
    }

    public int[] reset() {
        return arr;
    }

    public int[] shuffle() {
        if(arr == null) return null;
        int[] a = arr.clone();
        for(int j = 1; j < a.length; j++) {
            int i = random.nextInt(j + 1);
            swap(a, i, j);
        }
        return a;
    }
    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */