// Last updated: 03/02/2026, 16:08:25
class Solution {
    public String largestOddNumber(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int digit = ch - '0';
            if (digit % 2 != 0) {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}