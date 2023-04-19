package Practice;

import java.util.Stack;

public class StackTutorial2 {
    public static void main(String[] args) {
        // Y
        // B
        // R
        Stack <Character> tower=new Stack<>();

        tower.add('R');
        tower.add('B');
        tower.add('Y');

        System.out.println(tower.peek());
        System.out.println(tower.pop());
        System.out.println(tower);
        System.out.println(tower.contains('P')); // boolean
        System.out.println(tower.empty()); // boolean
        System.out.println(tower.get(0)); // red
        System.out.println(tower.set(1,'P')); // switch or update
        System.out.println(tower.size());
        
    }
}
