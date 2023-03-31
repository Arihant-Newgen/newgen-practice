package list;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList 
{
	public static void main(String args[])
	{
		ArrayList<Integer>list1=new ArrayList<>();
		list1.add(1);
		list1.add(4);
		list1.add(7);
		list1.add(5);
		System.out.println(list1);
		ArrayList<Integer>list2= list1;
//		ArrayList<Integer>list2= new ArrayList<>(list1);
		list2.add(2);
		list2.add(3);
		list2.add(6);
		System.out.println(list2);
//	SHUFFLE THE ARRAYLIST ELEMENTS
		Collections.shuffle(list2);
		System.out.println(list2);
		
	}

}
