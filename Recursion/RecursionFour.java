/* FACTORIAL OF A NUMBER */

public class RecursionFour {
    public static int calculateFact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact = calculateFact(n-1);
        int fact_n = n * fact;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
        int ans = calculateFact(n);
        System.out.println(ans);
    }
}
