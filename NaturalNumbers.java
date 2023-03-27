import java.util.Scanner;

public class NaturalNumbers 
{
    public static void main(String args[])
    {
        System.out.println("Enter the number n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=n;
        }
        System.out.println(sum);

    }
    
}
