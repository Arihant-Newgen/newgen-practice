import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        System.out.print("Enter the number :  ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        for(int i=1;i<=10;i++)
        {
            System.out.println( n +" x " + i +" = " + n*i );
        }
        System.out.println();
    }
    
}
        