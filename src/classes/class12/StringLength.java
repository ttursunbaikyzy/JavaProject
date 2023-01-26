package classes.class12;

public class StringLength {
    public static void main(String[] args) {

        // Creating an object of the String class
        String strObj=new String("Java");
        // another way of creating an object of String class a shorter way
        // mostly this is how w create the objects of String class
        String strObj2="Java";
        System.out.println(strObj2.length());

        String str="Banana ";
        int len=str.length();

        String name="Takhmina Tursunbai kyzy";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters");
        }



    }
}
