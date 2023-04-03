import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int rem,sum=0;
        int temp=n;
        System.out.println();
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
        System.out.println();
        sc.close();
    }
    
}
