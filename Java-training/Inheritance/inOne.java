package Inheritance;


public class inOne{
   
    // public class second extends first{
        // int num2 = 100;
    // }

   

    public static void main(String[] args) {
       
            //  second s = new second();;
            // s.num += s.num2;
            // System.out.println(s.num);
            /*
             * System.out.println(first.value);
             */

            second f = new second();
            f.num += f.num2;
            System.out.println(f.num);

            f.getNum();

            f.setNum(10);

            f.getNum();

        
    }
    
}
