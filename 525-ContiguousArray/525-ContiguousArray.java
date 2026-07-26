// Last updated: 26/07/2026, 10:01:03
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3
4        int n = nums.length;
5        int[] result = new int[n];
6
7        int left = 0;
8        int right = n - 1;
9        int index = n - 1;
10
11        while (left <= right) {
12
13            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
14                result[index] = nums[left] * nums[left];
15                left++;
16            } else {
17                result[index] = nums[right] * nums[right];
18                right--;
19            }
20
21            index--;
22        }
23
24        return result;
25    }
26}