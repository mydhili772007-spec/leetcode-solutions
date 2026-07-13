// Last updated: 13/07/2026, 10:10:16
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3
4        int n = nums.length;
5
6        for (int i = 0; i < n; i++) {
7
8            while (nums[i] > 0 &&
9                   nums[i] <= n &&
10                   nums[nums[i] - 1] != nums[i]) {
11
12                int correct = nums[i] - 1;
13
14                int temp = nums[i];
15                nums[i] = nums[correct];
16                nums[correct] = temp;
17            }
18        }
19
20        for (int i = 0; i < n; i++) {
21            if (nums[i] != i + 1)
22                return i + 1;
23        }
24
25        return n + 1;
26    }
27}