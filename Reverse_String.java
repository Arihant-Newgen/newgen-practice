import java.util.Scanner;
import java.lang.String;

public class Reverse_String {
    public static void main(String[] args) {
        
        System.out.print("Enter the string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        System.out.print("Original word: ");
        System.out.println(str);
        String nstr = "";

        for (int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i); 
            nstr= ch+nstr; 
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
