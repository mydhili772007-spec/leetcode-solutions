// Last updated: 03/02/2026, 16:09:12
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);                
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;   
        }
        return nums.length;
    }
}
