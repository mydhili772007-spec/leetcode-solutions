// Last updated: 14/06/2026, 20:53:18
1class Solution {
2
3    List<List<String>> ans = new ArrayList<>();
4
5    public List<List<String>> solveNQueens(int n) {
6
7        char[][] board = new char[n][n];
8
9        for(int i = 0; i < n; i++) {
10            Arrays.fill(board[i], '.');
11        }
12
13        backtrack(board, 0);
14
15        return ans;
16    }
17
18    public void backtrack(char[][] board, int row) {
19
20        if(row == board.length) {
21
22            List<String> temp = new ArrayList<>();
23
24            for(char[] r : board) {
25                temp.add(new String(r));
26            }
27
28            ans.add(temp);
29            return;
30        }
31
32        for(int col = 0; col < board.length; col++) {
33
34            if(isSafe(board, row, col)) {
35
36                board[row][col] = 'Q';
37
38                backtrack(board, row + 1);
39
40                board[row][col] = '.';
41            }
42        }
43    }
44
45    public boolean isSafe(char[][] board, int row, int col) {
46
47        for(int i = 0; i < row; i++) {
48            if(board[i][col] == 'Q')
49                return false;
50        }
51
52        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
53            if(board[i][j] == 'Q')
54                return false;
55        }
56
57        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
58            if(board[i][j] == 'Q')
59                return false;
60        }
61
62        return true;
63    }
64}