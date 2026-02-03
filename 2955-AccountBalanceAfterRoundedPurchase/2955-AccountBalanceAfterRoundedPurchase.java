// Last updated: 03/02/2026, 16:07:50
class Solution {
    public int accountBalanceAfterPurchase(int PA) {
    if(PA%10<=4)return 100-(PA/10)*10;
    else return 100-((PA/10)+1)*10;
}
}