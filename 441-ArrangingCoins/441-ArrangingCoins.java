// Last updated: 03/02/2026, 16:09:03
class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(n>=row){
            n-=row;
            row++;
        }
        return row-1;
    }
}