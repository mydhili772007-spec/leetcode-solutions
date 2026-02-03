// Last updated: 03/02/2026, 16:07:52
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int h:hours){
            if(h>=target){
                count++;
            }
        }
        return count;
    }
}