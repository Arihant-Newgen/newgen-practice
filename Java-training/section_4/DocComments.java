package section_4;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DocComments {
    public static void main(String[] args) {
        
    }

    /**
     * Function name: greet
     * 
     * Inside function:
     * 1. prints 'hi'
     * 
     */
    public static void greet(){
        System.out.println("hi");
    }

    /**
     * Function name: data
     * 
     * @param name (String)
     * @param age (int)
     * 
     * Inside function:
     * 1. prints name and age as per passed in parameters
     */
    public  static void data(String name, int age){
        System.out.println("hi mr." + name + "your age is " + age);
    }

    /**
     * Function name: area
     * 
     * @param side (int)
     * @return (int)
     * 
     * Inside function:
     * 1. calculate and returns the area.
     * 
     */
    public static int area(int side){
        int areas = side*side;
        return areas;
    }
}
