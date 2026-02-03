// Last updated: 03/02/2026, 16:07:45
class Solution {
    public int minimumOperations(int[] nums) {
       int ops=0;
       for(int x:nums){
        if(x%3!=0){
            ops++;
        }
       }
       return ops;
    }
}