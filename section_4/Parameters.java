package section_4;

public class Parameters {
    public static void main(String[] args) {
        names("Ariahnt", "Anushka");

        System.out.println("\n other\n");

        names("Suresh", "akash");

        System.out.println(ages(21,21));
    }

    public static void names(String str1, String str2){
        System.out.println("Name 1 : " + str1);
        System.out.println("Name 2 : " + str2);
    }

    public static int ages(int age1, int age2){
        return age1+age2;
    }
}
