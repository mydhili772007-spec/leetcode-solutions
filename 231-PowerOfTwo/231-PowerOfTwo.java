// Last updated: 03/02/2026, 16:09:19
class Solution {
    public boolean isPowerOfTwo(int n){
     if(n==0) return false;
     while(n%2==0){
        n/=2;
     }
     if (n==1) return true;
     else return false;
    }    
}