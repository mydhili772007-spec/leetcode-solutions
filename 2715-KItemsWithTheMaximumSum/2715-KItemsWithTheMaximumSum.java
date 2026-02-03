// Last updated: 03/02/2026, 16:08:00
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        else if(k<=(numOnes+numZeros)) return numOnes;
        else{
            int rem=k-(numOnes+numZeros);
            return numOnes-rem;
        }
    }
}