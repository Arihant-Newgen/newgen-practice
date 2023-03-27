class calculation
{
    void sum(int x,int y)
    {
        // int sum1=0;
        // int a=x;
        // int b=y;
        // sum1= a+b;
        System.out.println(x+y);
        // return sum1;
    }
    void sum(int x,int y,int z)
    {
        // int sum2=0;
        // sum2+=x+y+z;
        System.out.println(x+y+z);
        // return sum2;
        

    }
    void sum(double x,double y)
    {
        // double sum=0;
        // sum+=x+y;
        // return sum;
        System.out.println(x+y);
    }
    void sum(double x,double y,double z)
    {
        // double sum=0;
        // sum+=x+y+z;
        // return sum;
        System.out.println(x+y+z);
    }
}
public class CalculatorClass 
{
    public static void main(String args[])
    {
        calculation cal=new calculation();
        cal.sum(1,2);
        cal.sum(3.2,4.2);
        cal.sum(1,2,3);
        cal.sum(2.2,2.2,2.2);
        
    }

    
}
