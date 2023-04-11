import java.util.Scanner;

public class add_2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the row: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of the column: ");
        int m = sc.nextInt();

        System.out.print("Enter the Values of array 1: ");
        int arr1[][] = new int[n][m];
        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<m ; j++){
                arr1[i][j] = sc.nextInt();
            }
           
        }
       
        int arr2[][] = new int[n][m];
        System.out.print("Enter the Values of array 2: ");

        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<m ; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int ans[][] = new int[n][m];

        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<m ; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of 2d Array : ");

        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<m ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
