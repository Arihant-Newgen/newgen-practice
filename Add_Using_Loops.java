import java.util.Scanner;

public class Add_Using_Loops {
    public static void main(String[] args) {
        int a,b;
        int sum, count = 0;

        while(count <=3)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number : ");
            a = sc.nextInt();

            System.out.print("Enter the second number : ");
            b = sc.nextInt();
            sum = a+b;
            System.out.println();

            System.out.println("The sum of "+ a + " and " + b + " sum: " + sum);
            System.out.println();
            count ++;
        }
    }
}
