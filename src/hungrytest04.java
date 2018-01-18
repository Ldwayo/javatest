public class hungrytest04 {     //POJ3253
    int N;
    int[] L;
    public hungrytest04(int n,int[] l){
        this.N = n;
        this.L = l;
    }
    private void swap(int x,int y){
        int swa;
        swa = x;
        x = y;
        y = swa;
    }
    private void solve(){
        long ans = 0;
        while (N > 1){
            int mii1 = 0,mii2 = 1;
            if(L[mii1]>L[mii2]){
                swap(mii1,mii2);
            }
            for (int i = 2;i < N;i++){
                if(L[i]<L[mii1]){
                    mii2 = mii1;
                    mii1 = i;
                }
                else if (L[i]<L[mii2]){
                    mii2 = i;
                }
            }
            int t = L[mii1]+L[mii2];
            ans += t;
            if(mii1==N-1){
                swap(mii1,mii2);
            }
            L[mii1] = t;
            L[mii2] = L[N-1];
            N--;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        int n = 3;
        int[] l = {8,5,8};
        new hungrytest04(n,l).solve();
    }
}
