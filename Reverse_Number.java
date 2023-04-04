import java.util.Scanner; 

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int rev=0;
        while(n>0)
        {
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;
        }
        System.out.println("Reverse of the number is: " + rev);

        sc.close();
    }
}
