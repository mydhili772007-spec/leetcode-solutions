// Last updated: 03/02/2026, 16:09:25
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (char c : columnTitle.toCharArray()) {
            int value = c - 'A' + 1;     // Convert A→1, B→2, ... Z→26
            result = result * 26 + value;
        }

        return result;
    }
}