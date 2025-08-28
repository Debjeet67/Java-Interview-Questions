/* FIND THE LARGEST AND SMALLEST ELEMENT IN AN ARRAY */

import java.util.Scanner;
public class ArrayOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add in the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Elements = ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int largest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
            smallest = arr[i];
        }
            if(arr[i]>largest){
            largest = arr[i];

        }

        }
        System.out.println("Smallest element = " + smallest);
        System.out.println("Largest element = " + largest);
        sc.close();
    }
}



    



