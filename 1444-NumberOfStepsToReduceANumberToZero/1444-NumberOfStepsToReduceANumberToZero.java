// Last updated: 03/02/2026, 16:08:36
class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num!=0){
        if(num%2==0)  num=num/2;
        else num=num-1;
        steps++;
        }
        return steps;
    }
}