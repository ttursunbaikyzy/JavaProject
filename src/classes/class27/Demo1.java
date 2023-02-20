package classes.class27;

public class Demo1 {
    public static void main(String[] args) {
        String name="Tami";
        String name2="Sam";
        String name3="Nico";
        printNames(name,name2,name3);
        System.out.println();

        String [] names={"Tami","Sam","Niko","Lili"};
        displayNames(names);
    }
    public static void displayNames(String [] names){
        for(String name:names){
            System.out.println(name);
        }
    }

    public static void printNames(String name1, String name2, String name3){
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}
