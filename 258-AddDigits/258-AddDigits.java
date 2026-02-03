// Last updated: 03/02/2026, 16:09:15
class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return num%9==0?9:num%9;
    }
}