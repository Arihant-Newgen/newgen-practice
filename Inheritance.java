import java.util.Scanner;

class Animals{
    int a_no;
    String name;
    void display()
    {
        System.out.println("Enter the Cage number-:");
        Scanner sc= new Scanner(System.in);
        a_no=sc.nextInt();
        System.out.println("Enter the Animal name-:");
        Scanner s=new Scanner(System.in);
        name=s.nextLine();

    }
}
class Dog extends Animals{
    String place;
    void display()
    {
        System.out.println("Enter the Dog's current place");
        Scanner sc=new Scanner (System.in);
        place=sc.nextLine();

    }
}
public class Inheritance {
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.display();
        Animals a=new Animals();

        a.display();


    }
}
