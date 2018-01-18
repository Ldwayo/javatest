public class hungrytest01 {     //2.2.2

    private static int N,S[],T[];
    private static Pair itv[] = new Pair[]{new Pair(0,0),new Pair(0,0),
            new Pair(0,0),new Pair(0,0),new Pair(0,0)};
    private static void sort(Pair[] pairs){
        Pair pair;
        for(int i = 0;i<pairs.length;i++){
            for(int j = i+1;j<pairs.length;j++){
                if(pairs[i].first>pairs[j].first){
                    pair = pairs[i];
                    pairs[i] = pairs[j];
                    pairs[j] = pair;
                }
            }
        }
    }
    private static void solve(){
        itv[0].first = 0;
        for(int i = 0;i<N;i++){
            itv[i].first = T[i];
            itv[i].second = S[i];
        }
        sort(itv);
        int ans = 0;
        int t = 0;
        for(int i = 0;i<N;i++){
            if(t<itv[i].second){
                ans++;
                t = itv[i].first;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        N = 5;
        S = new int[]{2,1,4,8,6};
        T = new int[]{5,3,7,10,9};
        solve();
    }
}
