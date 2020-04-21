/* Signed by : Chitrasoma Singh
*/

class Solution {
    
    int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    
    class QNode{
        int x, y;
        QNode(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public void bfs(char[][] grid, int x, int y, int n, int m){
        
        Queue<QNode> q = new LinkedList<>();
        grid[x][y] = 2;
        q.add(new QNode(x, y));
        int a, b;
        
        while(!q.isEmpty()){
            QNode temp = q.poll();
            
            for(int i=0;i<4;i++){
                a = temp.x+dir[i][0];
                b = temp.y+dir[i][1];
                if(a>=0 && a<n && b>=0 && b<m && grid[a][b]=='1'){
                    grid[a][b] = 2;
                    q.add(new QNode(a, b));
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        if(n==0)
            return 0;
        int m = grid[0].length;
        int ans = 0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    ans += 1;
                    bfs(grid, i, j, n, m);
                }
            }
        }
        
        return ans;
    }
}