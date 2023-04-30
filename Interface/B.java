package interfaces;

public class B implements A,X{
 
	public void show()
	{
		System.out.println("Showing.....");
	}
	public void config() {
		System.out.println("Configgggg");
	}
	public void run()
	{
		System.out.println("Implementing run method");
	}
	public void interfacex()
	{
		System.out.println("Interface extending interface");
	}
}
