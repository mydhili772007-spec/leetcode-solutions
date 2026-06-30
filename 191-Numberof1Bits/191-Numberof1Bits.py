# Last updated: 30/06/2026, 09:55:03
1class Solution:
2    def totalHammingDistance(self, nums):
3        total = 0
4        n = len(nums)
5
6        for i in range(32):
7            ones = 0
8
9            for num in nums:
10                if (num >> i) & 1:
11                    ones += 1
12
13            zeros = n - ones
14            total += ones * zeros
15
16        return total