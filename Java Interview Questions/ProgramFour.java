/* WRITE A JAVA PROGRAM TO CALCULATE THE LCM OF TWO NUMBERS */
import java.util.Scanner;
public class ProgramFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number = ");
        int num2 = sc.nextInt();
        int gcd= findGcd(num1,num2);
        int lcm = (num1*num2)/gcd;
        System.out.println("LCM of two numbers = " +lcm);
        sc.close();
    }
    public static int findGcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a=temp;
            
        }
        return a;
    }
}
