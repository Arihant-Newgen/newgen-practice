import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = scan.nextInt();
        System.out.println("");
        System.out.print("Enter the second value : ");
        int b = scan.nextInt();
        System.out.print("Enter the choice : ");
        scan.nextLine();
        String s = scan.nextLine();
        int ans = 0;

        if (s.equals("+")) {
            ans = a + b;
            System.out.println("Your answer is: " + ans);
        } else if (s.equals("-")) {
            ans = a - b;
            System.out.println("Your answer is: " + ans);
        } else if (s.equals("*")) {
            ans = a * b;
            System.out.println("Your answer is: " + ans);
        } else if (s.equals("/")) {
            ans = a / b;
            System.out.println("Your answer is: " + ans);
        } else {
            System.out.println("YOU HAVE ENETERED THE WRONG CHOICE");
        }
        scan.close();
    }

}
