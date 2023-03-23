package exception.ex2;
import java.util.Scanner;
public class throwsExp {
    /**
     * function name: check
     * @param age1
     * @param age2
     * @throws Exception
     * 
     * output: Void
     */
    public static void check(int age1, int age2) throws Exception {
        int val = age1/age2;
    }

    public static void main(String[] args) {
        try {

            Scanner scn = new Scanner(System.in);
            int Age1 = scn.nextInt();
            int Age2 = scn.nextInt();

            check(Age1, Age2);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
