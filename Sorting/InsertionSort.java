public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7,5,2,8,4,9,6};
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
             arr[j+1]=current;
        }
       for(int num :arr){
        System.out.print(num + " ");
       }
    }

}
