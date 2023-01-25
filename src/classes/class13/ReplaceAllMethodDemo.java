package classes.class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {

        String str="kfaleGGHSR6468v484v4er^^#$%$&*(&";

        System.out.println(str.replaceAll("[A-Z]", "#"));
        // replaces All upper case letters from A to Z
        System.out.println(str.replaceAll("[a-z]", "#"));
        // replaces All upper case letters from a to z
        System.out.println(str.replaceAll("[0-9]", "#"));
        // replaces All upper case letters from 0 to 9
        System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
        // replaces All upper case letters from A to Z,a-z,0-9
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "#")); // ^ is used as not in this method
        // do not replace All upper case letters from A to Z,a-z,0-9
        System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
        // will remove instead of replace if using ""

    }
}
