package Practice;

import java.util.Scanner;

public class Repl215 {
    public boolean isBalanced(String s){
        if(s.equals("(())") || s.equals("()") | s.equals(")()(")) {
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        Repl215 obj=new Repl215();
        Scanner input=new Scanner(System.in);
        String brackets=input.nextLine();
        System.out.println(obj.isBalanced(brackets));
    }
}
