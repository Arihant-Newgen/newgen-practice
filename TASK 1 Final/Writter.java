import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writter {
    public void writeContent(String st)throws IOException{
        
        BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\gautam.gupta\\Desktop\\TASK 1 Final\\bsa.txt"));

        out.write(st);
        out.close();
    }
}
