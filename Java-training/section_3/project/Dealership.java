package section_3.project;

import java.util.*;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the java Dealership !");

        System.out.println("\n ...Press 'a' if you want to buy a car");
        System.out.println(" ...Press 'b' if you want to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("What is your budget ?\n");
                int budget = scan.nextInt();
                scan.nextLine();
               
                if (budget >= 10_000) {
                    System.out.println("\tGreat !! a ferarri is available.\n");

                    System.out.println("do you have insurance 'yes' or 'no' ?\n");
                    String insurance = scan.nextLine();

                        switch (insurance){
                            case "yes":System.out.println("tujh ko pakka car milegi");
                            break;

                            case "no": System.out.println("pehli fursat me insurance lele bhai");
                            break;

                            default:
                            System.out.println("Thoda bhadu hai kya !!..");
                        }
                } else {
                    System.out.println("paisa kam hai\n");
                }
                break;
            
            case "b":
                System.out.println("You choose : " + option);
                break;
            default:
                System.out.println("wrong input");
        }
        scan.close();
    }
}
