/* PRINT FROM 5 TO 1 */

public class RecursionOne {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNum(n);
    }
}
