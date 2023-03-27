public class Add
{
    //  In java we can make functions only inside the class and not outside, we can call a function of some other class.
    public static void sum(int x,int y)
{
    int sum=0;
    sum+=x+y;
    System.out.println("The sum of the two numbers is-:"+ sum);
    
}
    public static void main(String args[])
    {
        sum(20,30);

    }

    
    
}
