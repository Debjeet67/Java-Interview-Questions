/* WRITE A JAVA PROGRAM TO FIND THE GCD OF TWO NUMBERS */

import java.util.Scanner;
public class ProgramThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int a = sc.nextInt();
        System.out.println("Enter the second number = ");
        int b = sc.nextInt();
        while(b!=0){
            int temp =a;
            b = a % b;
            a = temp;

        }
        System.out.println("Gcd of two numbers = " +a);
        sc.close();
    }
}
