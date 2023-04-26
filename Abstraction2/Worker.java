package abstraction;
class Worker extends Employee
{
int wid;
String wname;
void acc()
{
System.out.println("Enter Worker id and name");
wid=s.nextInt();
wname=s.next();
}
void dis()
{
System.out.println("Wid="+wid+"wname"+wname);
}
}
