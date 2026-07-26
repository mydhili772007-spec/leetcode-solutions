// Last updated: 26/07/2026, 09:42:46
1class Solution {
2    public double myPow(double x, int n) {
3        long power = n;   // Use long to handle Integer.MIN_VALUE
4
5        if (power < 0) {
6            x = 1 / x;
7            power = -power;
8        }
9
10        double result = 1.0;
11
12        while (power > 0) {
13            if (power % 2 == 1) {
14                result *= x;
15            }
16            x *= x;
17            power /= 2;
18        }
19
20        return result;
21    }
22}