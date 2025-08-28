/* WRITE A JAVA PROGRAM TO COUNT THE FREQUENCY OF EACH ELEMENT IN AN ARRAY */

import java.util.Scanner;
public class ProgramTwelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add in the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + "elements = ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean visited[] = new boolean[n];
        System.out.println("Element | Frequency");
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + "      | " + count);
        }
        sc.close();
    }
}
