/* WRITE A JAVA PROGRAM TO FIND IF A STRING IS PALINDROM OR NOT */

import java.util.Scanner;
public class ProgramSix {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the string = ");
       String str = sc.nextLine();
       String rev = "";
       for(int i = str.length()-1;i>=0;i--){
        rev+=str.charAt(i);
       }
       if(str.equals(rev)){
        System.out.println("It is a palindrom number");
       }
       else{
        System.out.println("It is not a palindrom number");
       }
    }
}
