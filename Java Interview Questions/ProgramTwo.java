/* WRITE A JAVA PROGRAM TO CHECK IF A GIVEN NUMBER IS PRIME OR NOT */
import java.util.Scanner;
public class ProgramTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if(number <= 1){
            isPrime = false;
        }
        else {
            for(int i=2; i<= Math.sqrt(number);i++){
                if(number %i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number + "Is a prime number");
            }
            else{
                System.out.println(number + "Is not a prime number");
            }
        }
    }
}
