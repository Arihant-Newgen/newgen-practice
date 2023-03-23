package test;
class test{
    int num1;
}
public class example {
    public static void main(String[] args) {
        test t = new test();
        t.num1 = 100;
        System.out.println(t.num1);
    }
}

// We can create 2 classes in one file but except main class others should not have any acess specifiers 