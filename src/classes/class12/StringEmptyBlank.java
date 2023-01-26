package classes.class12;

public class StringEmptyBlank {
    public static void main(String[] args) {

        String str="        ";
        System.out.println(str.isEmpty()); // false (counts spaces)
        boolean isEmpty=str.isEmpty();
        System.out.println(str.isBlank()); // true (will not count spaces)




    }
}
