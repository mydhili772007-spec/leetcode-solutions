// Last updated: 03/02/2026, 16:08:54
class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int i = digits.length - 2;
        
        // Step 1: Find first decreasing digit from the right
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        
        if (i < 0) {
            return -1; // No larger permutation possible
        }
        
        // Step 2: Find the smallest digit larger than digits[i] to the right
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        
        // Step 3: Swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
        
        // Step 4: Reverse the suffix
        reverse(digits, i + 1, digits.length - 1);
        
        // Step 5: Convert back to integer
        long result = Long.parseLong(new String(digits));
        
        // Step 6: Check 32-bit integer limit
        return (result <= Integer.MAX_VALUE) ? (int) result : -1;
    }
    
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.nextGreaterElement(12)); // Output: 21
        System.out.println(sol.nextGreaterElement(21)); // Output: -1
    }
}

