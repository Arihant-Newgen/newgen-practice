package section6;

import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        int arr[] = new int[4];
        for(int i = 0 ; i<4;i++){
            arr[i] = i+1;
        }

        System.out.println(Arrays.toString(arr));

        String arr1[] = {"arihant", "ariah","priya"};
        System.out.println(arr1);
        for(int i = 0 ; i < arr1.length;i++){
            arr1[i] = "aj";
        }

        //
        
        System.out.println(Arrays.toString(arr1));
        String name = "arrr";
        name = "arihant";
        System.out.println(name);
    }
}
