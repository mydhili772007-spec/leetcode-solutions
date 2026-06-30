# Last updated: 30/06/2026, 09:20:16
1class Solution(object):
2    def hammingWeight(self, n):
3        return bin(n).count("1")
4        