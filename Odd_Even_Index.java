import java.util.Scanner;

public class Odd_Even_Index {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int sume = 0;
        int sumo = 0;

        System.out.println("Enter the value of array: ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 0){
                sume += arr[i];
            }
            else{
                sumo += arr[i];
            }
        }

        System.out.println("The sum of the even indexes is: " + sume);
        System.out.println("The sum of the odd indexes is: " + sumo);
        
        sc.close();
    }
}
