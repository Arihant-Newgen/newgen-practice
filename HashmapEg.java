package package1;
import java.util.HashMap;
public class HashmapEg 
{
	public static void main(String[] args)
    {
        
        HashMap<Integer, String> record = new HashMap<Integer, String>();
        record.put(1,"Neha");
        record.put(2,"Riya");
        record.put(3,"Diya");
        record.put(4,"Siya");
        record.put(5,"Yashas");
        System.out.println("Hash Map Data's are: "+record);
        System.out.println("Accessing the elements using the keys: "+record.get(1));
        record.remove(3);
        System.out.println("After removing 'key = 3': "+record);
        record.replace(1,"Nandan G N");
        System.out.println("After replacing the record: "+record);
        System.out.println("After cloning: "+record.clone());
        System.out.println("Getting only values: "+record.values());
        System.out.println("Getting only keys: "+record.keySet());
        System.out.println("The keys are: ");
        for(int i: record.keySet())
        {
            System.out.println(i);
        }

        
        System.out.println("The values are: ");
        for(String s: record.values())
        {
            System.out.println(s);
        }

        
        record.clear();
        System.out.println("After clearing the hashmap: "+record);
    }

}






   
