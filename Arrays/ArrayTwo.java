/* WRITE A JAVA PROGRAM TO COUNT THE FREQUENCY OF EACH ELEMENT IN AN ARRAY */

import java.util.Scanner;
public class ArrayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + "Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
          if(visited[i]) continue;
          int count =1;
          for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                visited[j] = true;
                count++;
            }
          } 
          System.out.println(arr[i] + " occurs " + count + " times");   
        }
        sc.close();
    }
}
