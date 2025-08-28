/* WRITE A JAVA PROGRAM TO FIND IF A NUMBER IS ARMSTRONG OR NOT */

import java.util.Scanner;
public class ProgramSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while(number>0){
            int digit = number%10;
            sum +=Math.pow(digit,digits);
            number/=10;
        }
        if(sum==originalNumber){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }
}
