package exception;

public class test1 {
    int age;
 
    public void setage(int age) throws Exception{
            if(age < 0){
                throw new Exception("Age can't be negative. please verify the ge you entered : " + age);
            }
            this.age = age;
    }
}
