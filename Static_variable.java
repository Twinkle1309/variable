package variable;

import java.sql.SQLOutput;

public class Static_variable {
    //static variable ( static data_type variable_name)
     static double i =5.5;
     static int c =10;

    public static void main(String[] args) {
        System.out.println("addition: " +(c+i));
        System.out.println("subtraction: " +(c-i));
        System.out.println("multiplication: " +(c*i));
        System.out.println("division: " +(c/i));
        System.out.println("module: " +(c%i));
    }
}
