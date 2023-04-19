package Practice;

import java.util.Stack;

public class StackTutorial {
    public static void main(String[] args) {
        Stack <String> games=new Stack<>();

        games.add("Call of Duty");
        games.add("Guitar Hero");
        games.add("Super Monkey Ball");

        // System.out.println(games.pop());
        System.out.println(games.peek());
        System.out.println(games);
    }
}
