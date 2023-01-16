package videos.videos3;

public class LogicalOperators {
    public static void main(String[] args) {

        /*
        || --> or
        && --> and
        ! --> not
         */

        int a =3;
        int b=4;
        // boolean c = !(a > b) && true;

        boolean isSunny = true;
        boolean amHappy=false;

        if((a<b && isSunny) || amHappy) {
            System.out.println("It's going to be a good day!");
        }

        // System.out.println(c);


    }
}
