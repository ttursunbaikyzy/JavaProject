package videos2;

public class LearnJava {
    public static void main(String[] args) {

        String name = "Tami";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        addExclamationPoint("hot dogs");
    }

    public static void addExclamationPoint (String s){
        System.out.println(s + "!");;
    }
}
