import java.util.Scanner;
public class survey {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("What is your age buddy!");
        // int num = scn.nextInt();
        // scn.nextLine();  
        // //nextLine() se pehle kuch bhi input ka agar lagaya toh vo next line skip ho jayega
        // // isiliye usko overcome karne ke liye ek khali next line laga do
        // System.out.println("May i know your name?");
        // String name = scn.nextLine();
        
        // int space_id=0;
        // for(int i = 0; i<name.length();i++){
        //     if(name.charAt(i) == ' '){
        //         space_id = i;
        //     }
            
        // }
        // System.out.println("Ohh ! Hey "+name.substring(0, space_id));
    
        String str = "akash";
        String str2 = "";
        for(int i = str.length()-1;i >= 0;i--){
            str2 += str.charAt(i);
        }
        
        System.out.println(str2); 
    
    }
    
}
