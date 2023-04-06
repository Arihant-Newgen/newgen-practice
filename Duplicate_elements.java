import java.util.Scanner;

public class Duplicate_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i <n ; i++) {  
            for(int j = i + 1; j <n ; j++) {  
            	if(arr[i] == arr[j])  
            		System.out.print("Duplicate elements are: " + arr[j]+ " ");  
            	}  
            }  

    }
}
