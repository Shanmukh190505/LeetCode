class Solution {
    public boolean isPowerOfTwo(int n) {
        // Check if n is greater than 0 and if n & (n - 1) is 0
        return n > 0 && (n & (n - 1)) == 0;
    }
}
