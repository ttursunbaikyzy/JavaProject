package classes.class3;

public class ShortHandOperator_4 {
    public static void main(String[] args) {
        int number = 10;
        // number = number+10; below is the shortcut for this and means the same as number+=10
        number+=20; // whatever value is stored in number variable add 20 to it
        System.out.println(number);

        int number2=20;
        number2-=10;
        System.out.println(number2);

        int number3 = 100;
        number3/=10;
        System.out.println(number3);

        int number4=10;
        number4*=20;
        System.out.println(number4);

    }
}
