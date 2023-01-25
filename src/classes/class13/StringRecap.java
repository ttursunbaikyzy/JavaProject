package classes.class13;

public class StringRecap {
    public static void main(String[] args) {

        // How can I print all the letters from this String one by one
        String str="Java is great";

        int counter=0;

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (str.charAt(i)=='a') {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Letter a has appeared: "+counter+" many times");

        // input is int, output is char


    }
}
