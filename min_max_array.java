import java.util.Scanner;

public class min_max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.print("Enter the Array elements: ");
        
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Your array elements are: ");
        for(int k = 0 ; k<n ; k++){
            System.out.print(arr[k] + ",");
        }
        int min = arr[0];
        int max = arr[0];

        for(int i = 1 ; i<n ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        sc.close();
    }
}
