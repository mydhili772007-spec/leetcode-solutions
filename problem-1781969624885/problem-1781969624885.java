// Last updated: 20/06/2026, 21:03:44
1class Solution {
2    public String[] createGrid(int m, int n) {
3           String[]grid=new String[m];
4        for(int i=0;i<m;i++){
5            StringBuilder row=new StringBuilder();
6            for(int j=0;j<n;j++){
7                if(i==0||j==n-1){
8                    row.append('.');
9                }else{
10                    row.append('#');
11                }
12            }
13            grid[i]=row.toString();
14        }
15        return grid;
16    }
17}