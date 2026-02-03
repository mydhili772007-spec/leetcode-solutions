// Last updated: 03/02/2026, 16:08:37
class Solution {
    public String tictactoe(int[][] moves) {
         int[][] arr = new int[3][3];
        boolean turn = false;
        for (int[] move : moves) {
            arr[move[0]][move[1]] = turn ? 2 : 1;
            turn = !turn;
        }
        
        int[][][] win = {
            {{0,0},{0,1},{0,2}},
            {{1,0},{1,1},{1,2}},
            {{2,0},{2,1},{2,2}},
            {{0,0},{1,0},{2,0}},
            {{0,1},{1,1},{2,1}},
            {{0,2},{1,2},{2,2}},
            {{0,0},{1,1},{2,2}},
            {{0,2},{1,1},{2,0}}
        };
        
        for (int[][] w : win) {
            int a = arr[w[0][0]][w[0][1]];
            int b = arr[w[1][0]][w[1][1]];
            int c = arr[w[2][0]][w[2][1]];
            if (a != 0 && a == b && b == c)
                return a == 1 ? "A" : "B";
        }
        
        return moves.length == 9 ? "Draw" : "Pending";
    }
}