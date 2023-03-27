import java.util.Scanner;

// Table of n 
public class multiplication 
{
    public static void main(String args[])
    {
        System.out.println("Enter the number-:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Table of n-:" + n +"x" + i +"=" + n*i );

        }
        System.out.println();
    }
    
}
