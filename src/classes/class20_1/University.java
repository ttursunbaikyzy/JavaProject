package classes.class20_1;

import classes.class20.JavaTeacher;

public class University {
    public static void main(String[] args) {
        JavaTeacher jt=new JavaTeacher();

        jt.homework(); // // public
        // jt.grade(); // protected not available in different package
        // jt.scholarship(); // default not available in different package
        // java.extraPoint(); // private not visible
    }
}
