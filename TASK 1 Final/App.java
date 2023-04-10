import java.io.IOException;
import java.util.*;

public class App{
    public static void main(String[] args)throws IOException{
        
        Reader rr = new Reader(); 
        
        HashMap<String, String> mapp = rr.getmap();
        
        
        Scanner sc = new Scanner(System.in);
        
        String st = ""; 
        for (String key: mapp.keySet())
        
        { 
            System.out.println("Please enter value of " + key);
            st += key + "=" +sc.nextLine() + "\n";
        
        }
        
        Writter wr = new Writter(); 
        wr.writeContent(st); 
        sc.close(); 
    }
}
