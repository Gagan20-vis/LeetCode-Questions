/*
*************Intution****************
* First we just check and count the zeros int the array,If there are more than 1 zeroes then we just return a new array.
* Then we compute the result , if there are no any zero we just simply divide the prduct by element or if there are only one zero and the current elemnt is zero
* that mean we find that zero so we simply replace it by the product and last if the element is negative we replace it by 0.
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int product = 1;
        int zeroCount = 0;

        // Compute overall product and count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
                if (zeroCount > 1) {
                    // If there are multiple zeros, the result is all zeros except for one index
                    return new int[n];
                }
            } else {
                product *= num;
            }
        }

        // Compute result
        for (int i = 0; i < n; i++) {
            if (zeroCount == 0) {
                result[i] = product / nums[i];
            } else if (zeroCount == 1 && nums[i] == 0) {
                result[i] = product;
            } else {
                result[i] = 0;
            }
        }

        return result;
    }

}