import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check-:");
        int n=sc.nextInt();
        int rem,sum=0;
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println(" It is a Palindrome");

        }
        else{
            System.out.println("Not a Palindrome");
        }


        

        

    }
    
}
