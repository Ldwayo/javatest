public class test01 {
    final static int MAX = 4;
    static int a[];
    static int n = 4;
    static int k = 13;
    static String string = "";
    private static boolean dfs(int i,int sum){
        if(i == n) return sum == k;
        if(dfs(i+1,sum)) return true;
        if(dfs(i+1,sum+a[i])){
            string = string+a[i];
            return true;
        }
        return false;
    }
    private static void solve(){
        if(dfs(0,0)) System.out.println("yes"+string+"\n");
        else System.out.println("no\n");
    }
    public static void main(String args[]){
        a = new int[MAX];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        a[3] = 7;
        solve();
    }
}
