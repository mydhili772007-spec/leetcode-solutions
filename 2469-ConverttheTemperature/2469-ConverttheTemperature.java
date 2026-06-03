// Last updated: 03/06/2026, 22:11:07
1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double Kelvin=celsius+273.15;
4        double Fahrenheit =celsius*1.80+32.00;
5        double arr[]={Kelvin,Fahrenheit};
6        return arr;
7    }
8}