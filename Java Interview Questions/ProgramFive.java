/* WRITE A JAVA PROGRAM TO FIND THE FIBONACCI SERIES UPTO N TERMS(USING LOOP) */

import java.util.Scanner;
public class ProgramFive {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of terms = ");
       int n = sc.nextInt();
       int first = 0,second = 1;
       System.out.println("Fibonacci series upto " + n + "terms:");
       for(int i =1;i<=n;i++){
        System.out.println(first + " ");
        int next = first + second;
        first = second;
        second = next;
       }
       sc.close();
   } 
}
