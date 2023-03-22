package exception.ex2;

public class tryCatch {
    public static void main(String[] args) {
        try{
            int num = 10/0;
            System.out.println("----------------x---------------");
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("This is the finally block");
        }
    }
}
