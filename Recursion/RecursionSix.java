/* PRINT X^N(STACK HEIGHT = N) */

public class RecursionSix {
    public static int calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int a = calcpower(x, n-1);
        int b = x*a;
        return b;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calcpower(x, n);
        System.out.println(ans);
    }
}
