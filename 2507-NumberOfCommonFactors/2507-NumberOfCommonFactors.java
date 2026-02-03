// Last updated: 03/02/2026, 16:08:16
class Solution {
    public int commonFactors(int a, int b) {
        int min=a<b?a:b;
        int count=0;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0)
               count++;
        }
        return count;
    }
}