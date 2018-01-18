public class hungrytest02 {     //2.2.3
    private static int N = 6;
    private static char[] S = {'A','C','D','B','C','B'};
    private static void solve(){
        int a = 0;
        int b = N-1;
        while(a<=b){
            Boolean left = false;
            for(int i = 0;a+i<=b;i++){
                if(S[a+i]<S[b-i]){
                    left = true;
                    break;
                }
                else if(S[a+i]>S[b-i]){
                    left = false;
                    break;
                }
            }
            if(left)
                System.out.print(S[a++]);
            else System.out.print(S[b--]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        solve();
    }
}
