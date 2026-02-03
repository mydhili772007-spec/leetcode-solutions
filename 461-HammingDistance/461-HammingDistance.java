// Last updated: 03/02/2026, 16:09:01
class Solution {
    public int hammingDistance(int x, int y) {
        int xor= x^y;
        return Integer.bitCount(xor);

    }
}