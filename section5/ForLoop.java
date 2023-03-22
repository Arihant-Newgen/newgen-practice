package section5;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class ForLoop {


    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want me to print : ");
        String line = scan.nextLine();

        for(int i = 1; i <= 10; i++){
           System.out.print(i + ". ");
           printName(line);

        }

    }

    public static void printName(String l1) {
        System.out.println(l1);
    }
}
