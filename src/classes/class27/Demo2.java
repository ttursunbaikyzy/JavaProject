package classes.class27;

public class Demo2 {
    public static void main(String[] args) {
        String name = "Sam";
        String[] names = {"Tami", "Sam", "Niko", "Lili"};
        // create a method which can search a name from this array
        System.out.println(contains(name, names));
        String[] arr= new String [2];

        // name[4]="Shah";
    }

    public static boolean contains(String findName, String[] names) {
        for (String name : names) {
            if (name.equals(findName)) {
                return true;
            }
        }
        return false;
    }
}