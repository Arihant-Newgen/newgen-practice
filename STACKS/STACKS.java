package STACKS;

import java.util.Stack;

public class STACKS {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);

        System.out.println(st);

        st.pop();
        st.pop();

        System.out.println(st);
        
    }
}
