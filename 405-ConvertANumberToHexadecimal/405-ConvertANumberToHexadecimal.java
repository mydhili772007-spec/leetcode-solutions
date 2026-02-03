// Last updated: 03/02/2026, 16:09:04
class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        char[] m = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuffer ans =new StringBuffer();
        while(num !=0){
            int d =num & 15;
            ans.append (m[d]);
            num >>>= 4;
        }
        return ans.reverse().toString();
    }

}