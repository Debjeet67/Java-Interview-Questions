/* WRITE A JAVA PROGRAM TO PERFORM BINARY SEARCH IN AN ARRAY */

import java.util.Scanner;
public class ProgramThirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search = ");
        int target = sc.nextInt();
        int low=0, high=n-1;
        boolean found=false;
        while(low<high){
            int mid=(low+high)/2;
        
        if(arr[mid]==target){
            System.out.println("Found at the mid position " +mid);
            found=true;
            break;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
        if(!found){
            System.out.println("Not found");
        }
        sc.close();

    }
}
