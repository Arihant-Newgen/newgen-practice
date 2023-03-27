class A
{
    int x;
    void print()
    {
        System.out.println(x);
    }
}
class B extends A
{
    int y;
    void show()
    {
        System.out.println(y);
    }
}
class C extends B{
    int z;
    void display()
    {
        System.out.println(z);
    }
}
public class MultilevelInheritance
{
   public static void main(String args[])
   {
        A obja=new A();
        obja.x=10;
        obja.print();
        B objb=new B();
        objb.y=20;
        objb.show();
        C objc=new C();
        objc.z=90;
        objc.display();

   }
    
}
