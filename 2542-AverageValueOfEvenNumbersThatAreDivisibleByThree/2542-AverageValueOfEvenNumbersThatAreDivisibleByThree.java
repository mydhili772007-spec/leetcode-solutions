// Last updated: 03/02/2026, 16:08:14
class Solution {
    public int averageValue(int[] nums) {
        
        int sum = 0, count = 0;
        
        for (int num : nums) {
            if (num % 6 == 0) {   // divisible by 2 and 3
                sum += num;
                count++;
            }
        }
        
        return count == 0 ? 0 : sum / count;
    }
}


