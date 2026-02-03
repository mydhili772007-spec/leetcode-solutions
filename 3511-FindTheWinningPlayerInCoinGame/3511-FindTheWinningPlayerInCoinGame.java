// Last updated: 03/02/2026, 16:07:42
class Solution {
    public String winningPlayer(int x, int y) {
        int turn=1;
        while (x>=1 && y>=4){
            x-=1;
            y-=4;
            turn++;
        }
        if(turn %2==0) return "Alice";
        else  return "Bob";
    }
}