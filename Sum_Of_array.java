import java.util.Scanner;

public class Sum_Of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        int summ = 0;
        System.out.print("Enter the Array elements: ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Your array elements are: ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + ",");
            summ+=arr[i];
        }
        System.out.println();
        System.out.println( "Sum of array is: " + summ);

        sc.close();
    }
}
