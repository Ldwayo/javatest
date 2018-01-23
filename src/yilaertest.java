public class yilaertest {
    int n;
    int a1[][];
    int a2[][];
    private yilaertest(int n){
        this.n = n;
        a1 = new int[n][n];
        a2 = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                a1[i][j] = 0;
                a2[i][j] = 0;
            }
        }
    }
    private void solve(){
        int ens = (1+n)/2;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i == 0&&j == 0)
                    a1[i][j] = 1;
                else if (j!=0) {
                    a1[i][j] = (a1[i][j - 1] + ens) % n;
                    if(a1[i][j] == 0){
                        a1[i][j] = n;
                    }
                }
                else {
                    a1[i][j] = (a1[i - 1][j] + ens) % n;
                    if(a1[i][j] == 0){
                        a1[i][j] = n;
                    }
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                a2[i][j] = a1[i][j];
            }
        }
        for(int i = 0;i<n;i++){
            for (int j = 0;j<ens-1;j++){
                int std;
                std = a2[i][j];
                a2[i][j] = a2[i][n-1-j];
                a2[i][n-1-j] = std;
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                a2[i][j]--;
                a2[i][j] = a2[i][j]*n;
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                a1[i][j]+=a2[i][j];
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        new yilaertest(7).solve();
    }
}
