package arrayListProgs;

import java.util.ArrayList;
import java.util.Scanner;

public class AL1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> AL = new ArrayList<>();
        System.out.println("start entering nums (0 to stop)");
        // int val = sc.nextInt();

        int val;
        do {
            val = sc.nextInt();
            AL.add(val);
        } while (val != 0);

        System.out.println("-------------------------------------------------\n");

        System.out.println("enter num to be deleted : ");
        int del1 = sc.nextInt();

        System.out.println("-------------------------------------------------\n");
 
        for (int i = 0; i < AL.size(); i++) {
            if (AL.get(i) == del1) {
                AL.remove(i);
                break;
            }
        }

        // AL.remove(del1);

        System.out.println("The final result is : " + AL);

       
    }
}
