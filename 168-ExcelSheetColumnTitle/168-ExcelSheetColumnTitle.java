// Last updated: 03/02/2026, 16:09:27
class Solution {
    public String convertToTitle(int num) {
        StringBuffer ans = new StringBuffer();
        while(num>0){
            num --;
            ans.append((char)((num%26)+65));
            num/=26;
        }
        return ans.reverse().toString();
    }
}