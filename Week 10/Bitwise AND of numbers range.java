class Solution {
    public int rangeBitwiseAnd(int left, int right) {
          int shift = 0;
        while (left < right) {
            left >>= 1;                 // perform left shift
            right >>= 1;                // perform right shift
            shift++;
        }
        return left << shift;
    }
}
