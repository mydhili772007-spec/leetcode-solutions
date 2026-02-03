// Last updated: 03/02/2026, 16:07:35
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0,dd=0;
        for(int x:nums){
            if(x<10) sd+=x;
            else dd+=x;
        }
        return sd!=dd;
    }
}