/* WRITE A JAVA PROGRAM TO REVERSE A STRING */


import java.util.Scanner;
public class Stringone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string = ");
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String = " +reversed);

    }
}