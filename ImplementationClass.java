interface A
{
    int x=20;
    void m1();

}
public class  ImplementationClass  implements A
{
   public void m1()
    {
        System.out.println("The value is-: " + x);
    }
    public static void main(String args[])
    {
            A x= new ImplementationClass();
            x.m1();

            
    }
    
}
