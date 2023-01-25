package classes.class13;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder(); // vs String str=""
        for (int i = 0; i < 1000; i++) {
            str.append(i);
        }

    }
}
