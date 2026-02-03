// Last updated: 03/02/2026, 16:08:53
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;

        
    }
}