// Method Overloading
public class overloading 
{
       static void sum(int a,int b)
        {
            
            int z;
            z=a+b;
            System.out.println(z);

        }
        static void sum(double a,double b)
        {
            double z;
            z=a+b;
            System.out.println(z);
        }
        public static void main(String args[])
        {
            System.out.println("The sum is-:");
            // sum(2,2);
            sum(1.1,1.1);
        }
    
}
