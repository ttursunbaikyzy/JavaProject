package classes.class18;

public class Task1 {
    /*
    Write a java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

    private Task1 (){
        System.out.println("Constructor without any parameters");
    }

    Task1 (String name){
        System.out.println("Constructor with a String as parameter");
    }

    protected Task1 (int number){
        System.out.println("Constructor with an int as parameter");
    }

    public Task1 (char c){
        System.out.println("Constructor with a char as parameter");
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        Task1 task2=new Task1("Java");
        Task1 task3=new Task1(1000);
        Task1 task4=new Task1('G');
    }


}
