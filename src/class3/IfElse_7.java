package class3;

public class IfElse_7 {
    public static void main(String[] args) {

        int money=150;
        System.out.println(money>=300);

        if(money>=300){
            System.out.println("yaaaay let's go for shopping");  // java executes this if true
            // if false, then it won't print anything in the console
        }

        if(money<300){
            System.out.println("Let's save more");
            System.out.println("Maybe I am spending too much on food");
        }

    }
}
