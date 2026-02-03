// Last updated: 03/02/2026, 16:08:06
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;
        for(int x:nums){
            elementsum+=x;
            while(x!=0){
                digitsum+=x%10;
                x/=10;
            }
        }
         return Math.abs(elementsum-digitsum);
    }
}