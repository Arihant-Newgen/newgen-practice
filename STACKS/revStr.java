package STACKS;

import java.util.Stack;

// This is the programe for reversing a string using stacks
public class revStr {
    public static void main(String[] args) {
        String str = "arihant";
        Stack <String> st = new Stack<>();
        
        
        for(int i = 0; i < str.length(); i++){
            String ch = String.valueOf(str.charAt(i)) ;  // method to typecast char to string
            st.push(ch);
        }

        while(st.size()!=0){
            System.out.println(st.pop());
        }
    }
}
