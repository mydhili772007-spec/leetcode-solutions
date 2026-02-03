// Last updated: 03/02/2026, 16:07:38
class Solution {
    public String reversePrefix(String s, int k) {
        String result = "";
        for( int i =k-1; i>=0;i--){
            result=result+s.charAt(i);
        }
        for(int i =k; i<s.length();i++){
            result= result+ s.charAt(i);
        }
        return result;
    }
}