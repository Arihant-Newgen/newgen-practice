class Bank
{
    double rateOfInterest()
    {
        return 0;
    }
}
class SBI extends Bank{
    double rateOfInterest()
    {
        return 10.3;
    }

}
class ICICI extends SBI{
    double rateOfInterest()
    {
        return 4.4;
    }

}
class Axis extends ICICI{
    double rateOfInterest()
    {
        return 5.5;
    }

}
public class MethodOverriding 
{
    public static void main(String args[])
    {
       SBI rate= new SBI();
       System.out.println(rate.rateOfInterest());
       ICICI r=new ICICI();
       System.out.println(r.rateOfInterest());


    }

    
}
