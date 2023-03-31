package list;
import java.util.ArrayList ;
import java.util.List;
public class ExtractList 
{
	public static void main(String args[])
	{
		List<String>list=new ArrayList<String>();
		list.add("Navratri Day1");
		list.add("Navratri Day2");
		list.add("Navratri Day3");
		list.add("Navratri Day4");
		list.add("Navratri Day5");
		list.add("Navratri Day6");
		list.add("Navratri Day7");
		list.add("Navratri Day8");
		list.add("Navratri Day9");
	
		
		System.out.println(list.subList(3, 8));
		
	}

}
