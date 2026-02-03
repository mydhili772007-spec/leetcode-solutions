// Last updated: 03/02/2026, 16:08:32
class Solution {
    public int numWaterBottles(int NB,int NE) {
        int drink=NB;
        int empty=NB;
        while(empty>=NE){
            int newD=empty/NE;
            empty=(empty%NE)+newD;
            drink+=newD;
        }
        return drink;
    }
}       