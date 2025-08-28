/* write a java program to find the factorial of a number */

import java.util.Scanner;
public class ProgramEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int number = sc.nextInt();
        long factorial = 1;
        for(int i=1;i<=number;i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
        sc.close();
    }
}
