package String;

import java.util.*;

public class firstString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Sentance : ");
        String name = scn.nextLine(); // this is the great comapany lead by great leaders
        System.out.println(name.toCharArray()[1]);

        System.out.println("now enter the word : ");
        String word = scn.next();
        int pt = -1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {

                String sub = name.substring(pt + 1, i);

                if (sub.equals(word) == true) {
                    System.out.println("First occurance is at : " + (pt + 1));
                    break;
                }

                pt = i;

            }
        }

    }
}
