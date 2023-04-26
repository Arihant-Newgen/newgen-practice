package abstraction;
class Manager extends Employee
{
int id;
String name;
double ph;
void acc()
{

System.out.println("Enter id , name and Phone number of manager");
id=s.nextInt();
name=s.next();
ph=s.nextDouble();
}
void dis()
{
System.out.println("mid="+id +" "+"mname="+name +" "+"mph="+ph);
}
}
