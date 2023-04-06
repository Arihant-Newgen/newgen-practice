package eg1;


//import abstractexample.Employee;
//import abstractexample.Newgen;

abstract class Newgen
{
	abstract void printInfo();
}
class Employee extends Newgen{
	void printInfo()
	{
		String name="Disha";
		int age=21;
		int salary=20000;
		String dept="PES";
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(dept);
		
		
	}
}
class Base
{
	public static void  main(String args[])
	{
		Newgen n= new Employee();
		n.printInfo();
		
	}

}
