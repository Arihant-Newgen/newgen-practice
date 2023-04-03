import java.util.Scanner;

public class Sum_number {
    public static void main(String[] args) {
        
        System.out.print("Enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        System.out.println();
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of the numbers are :" + sum + "\n");
 
    }
}
