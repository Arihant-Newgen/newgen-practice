package abstraction;

public class Test
{
	public static void main(String args[])
	{
		Manager m=new Manager();
		m.acc();
		Worker w=new Worker();
		w.acc();
		m.dis();
		w.dis();
	}

}
