public class dfstest02 {        //2.1.4
    static int N = 3,M = 6;
    static char[][] field={{'W','.','.','.','W','W'},{'W','W','.','.','.','W'},{'.','.','.','W','.','.'}};
    private static void dfs(int x,int y){
        field[x][y] = '.';
        for(int dx = -1;dx<=1;dx++){
            for(int dy = -1;dy<=1;dy++){
                int nx = x+dx;
                int ny = y+dy;
                if(nx>=0&&ny>=0&&nx<N&&ny<M&&field[nx][ny]=='W') dfs(nx,ny);
            }
        }
        return;
    }
    private static void solve(){
        int res = 0;
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                if(field[i][j]=='W'){
                    dfs(i,j);
                    field[i][j]='W';
                    res++;
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String args[]){
        solve();
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
