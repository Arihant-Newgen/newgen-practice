import java.util.Scanner;

public class ReturnFunction
{
    public static void main(String args[])
    {
        // System.out.println("Enter the two numbers for multiplication-:");
        // Scanner sc =new Scanner (System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        int ans=multiplication();
        System.out.println("The final answer is-:");
        System.out.println(ans);

         
    }
    static int multiplication()
    {
        System.out.println("Enter the two numbers for multiplication-:");
        Scanner sc =new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int m=a*b;
        return m;
    }
    
}
