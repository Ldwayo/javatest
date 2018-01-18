import java.util.LinkedList;
import java.util.Queue;

public class bfstest01 {    //2.1.5
    static int INF = 10000;
    static char[][] maze = {{'#','S','.','.','.'},{'.','.','.','#','.'},{'#','.','.','G','.'}};
    static int M,N;
    static int sx,sy;
    static int gx,gy;
    static int[][] d;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    public static class Pair{
        public final int first;
        public final int second;
        public Pair(int f,int s){
            this.first = f;
            this.second = s;
        }
    }
    private static int bfs(){
        Queue<Pair> queue = new LinkedList<Pair>();
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                d[i][j] = INF;
            }
        }
        queue.add(new Pair(sx,sy));
        d[sx][sy] = 0;
        while(queue.size()!=0){
            Pair pair = queue.poll();
            if(pair.first == gx&&pair.second ==gy){
                break;
            }
            for(int i = 0;i<4;i++){
                int nx = pair.first+dx[i];
                int ny = pair.second+dy[i];
                if(nx>=0&&ny>=0&&nx<N&&ny<M&&maze[nx][ny]!='#'&&d[nx][ny]==INF){
                    queue.add(new Pair(nx,ny));
                    d[nx][ny] = d[pair.first][pair.second]+1;
                }
            }
        }
        return d[gx][gy];
    }
    private static void solve(){
        int res = bfs();
        System.out.println(res);
    }
    public static void main(String args[]){
        N = 3;
        M = 5;
        d = new int[N][M];
        sx = 0;
        sy = 1;
        gx = 2;
        gy = 3;
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                System.out.print(maze[i][j]+"");
            }
            System.out.println();
        }
        solve();
    }
}
