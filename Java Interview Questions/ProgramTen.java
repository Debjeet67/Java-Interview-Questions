/* WRITE A JAVA PROGRAM TO IMPLEMENT LINEAR SEACH IN AN ARRAY */

import java.util.Scanner;
public class ProgramTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {56,78,96,48,25,75,41,95,36,75,98,15};
        System.out.println("Enter the element you want to search = ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==target){
                System.out.println("Element found at index = " +i);
                found = true;
                break;
            }
            }
                if(!found){
                System.out.println("Element not found in the array");
            }
        }
    }

