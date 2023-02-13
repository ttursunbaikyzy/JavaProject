package classes.class23;

public class FinalKeyword {
    final double gravity=9.8;
    final double PI=3.14;
    final double lightSpeed=299792458;
    final void tryChangningGravity(){
        // gravity=1.6;  // we get an error because we cannot assign a value to final variable
    }
}

class Child extends FinalKeyword{
    /* void tryChangningGravity(){
        // gravity=1.6;  // we get an error because we cannot assign a value to final variable
    }*/
}
