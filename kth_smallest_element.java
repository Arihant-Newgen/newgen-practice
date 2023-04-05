import java.util.Arrays;
import java.util.Scanner; 

public class kth_smallest_element {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the Array elements: ");
        
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the kth element to be found: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        int anss = arr[k-1];

        System.out.println("Your answer is: " + anss);
        sc.close();
    }
}
