public class hungrytest03 {     //POJ3096
    int N = 8;
    int R = 10;
    int[] X = {1,7,15,20,30,50,59,71};
    public void solve(){
        int i = 0;
        int ans = 0;
        while(i < N){
            int s = X[i++];
            while (i<N&&X[i]<=s+R){
                i++;
            }
            int p = X[i-1];
            while (i<N&&X[i]<=p+R){
                i++;
            }
            ans++;
        }
    System.out.println(ans);
    }
    public static void main(String args[]){
        new hungrytest03().solve();
    }
}
