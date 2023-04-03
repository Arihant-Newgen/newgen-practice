import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=sc.nextInt(); 
        System.out.println("Enter the second number");  
        int y=sc.nextInt();
        int t;
        t=x;
        x=y;
        y=t;
        System.out.println("The numbers after swapping are-:" + "x-:" + x +"\t" + "y-: " +y );
        
    }
}
