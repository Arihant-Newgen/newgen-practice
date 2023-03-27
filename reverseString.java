import java.util.Scanner;

// Reversing a string
import java.util.Scanner;
import java.lang.String;

public class reverseString
{
    public static void main(String args[])
    {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        // Method 1:
        // String str="disha";
        String rev="";
        // for(int i=str.length()-1;i>=0;i--)
        // {
        //     rev=rev+str.charAt(i);
            
        // }
        // System.out.println(rev);
        // Method 2: Using character array
        // char a[]=str.toCharArray();
        // int len=a.length;
        // for(int i=len-1;i>=0;i--)
        // {
        //     rev=rev+a[i];

        // }
        // System.out.println(rev);
        // Method 3: Using string buffer class
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());

    }

    
    
}
