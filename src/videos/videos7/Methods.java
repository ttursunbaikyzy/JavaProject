package videos.videos7;

public class Methods {
    public static void main(String[] args) {

        welcome();
        multiply(5,10);
        multiply(2,3);
        divide(20,5);
        divide(100, 10);

        /* instead of below:
        int a = 5;
        int b = 10;
        System.out.println(a*b);

        int c = 2;
        int d = 3;
        System.out.println(c*d);*/

    }

    public static void welcome () {
        System.out.println("Welcome to our calculator");
    }

    public static void multiply (int a, int b) {
        System.out.println(a*b);
    }

    public static void divide (int a, int b) {
        System.out.println(a/b);
    }

}
