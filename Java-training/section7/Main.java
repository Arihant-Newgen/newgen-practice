package section7;

public class Main {
    public static void main(String[] args) {
        car c1 = new car();
        c1.setCname("nissan");
        c1.setModel("naya hai bhai");
        c1.setPrice(1000000);
        c1.setWheels(4);

        System.out.println(c1.getCname());
        System.out.println(c1.getModel());
        System.out.println(c1.getPrice());
        System.out.println(c1.getWheels());


        car c2 = new car("maruti", "Aulto", 400000);
        System.out.println(c2.getCname());
        System.out.println(c2.getModel());
        System.out.println(c2.getPrice());
        System.out.println(c2.getWheels());

        car c3 = new car(c2);
        System.out.println("--------------------------------------");
        System.out.println(c3.getCname());
        System.out.println(c3.getModel());
        System.out.println(c3.getPrice());
        System.out.println(c3.getWheels());


    }
}
