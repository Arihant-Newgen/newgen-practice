import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Reader {

    HashMap<String, String> map = new HashMap<String, String>();

	public HashMap<String, String> getmap(){
        HashMap<String, String> mapp = new HashMap<String , String>();

		File file = new File("C:\\Users\\gautam.gupta\\Desktop\\TASK 1 Final\\bsa.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			String ans = null;
			while ((s = br.readLine()) != null) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == ' ') {

						ans = s.substring(0, i);
						mapp.put(ans, "");
						break;
					}
				}
            }
			br.close();

		} 
		catch (IOException e)
		{
			System.out.println(e);
		}
		return mapp;
    }
    
}
