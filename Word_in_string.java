import java.util.Scanner;

public class Word_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Statement : ");
        String name = sc.nextLine();

        System.out.print("Enter the word : ");
        String word = sc.next();
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
        sc.close();
    }
}
