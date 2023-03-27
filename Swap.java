import java.util.Scanner;

public class Swap 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int x=sc.nextInt(); 
    System.out.println("Enter the second number");  
    int y=sc.nextInt();
    // With using  3rd variable
    // int t;
    // t=x;
    // x=y;
    // y=t;
    // System.out.println("The numbers after swapping are-:" + "x-:" + x +"\t" + "y-: " +y );
    // Without the use of 3rd variable
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("The numbers after swapping are-:" + "x-:" + x +"\t" + "y-: " +y );



    }

    

}
