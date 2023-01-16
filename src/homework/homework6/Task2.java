package homework.homework6;

public class Task2 {
    public static void main(String[] args) {

        // Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).

        String [] names={"Omid","Yulia","Tatiana","Sam", "Tami"};

        System.out.println(names[4]);

        System.out.println("*************************");

        String [] names2 = new String [5];

        names2[0]="Omid";
        names2[1]="Yulia";
        names2[2]="Tatiana";
        names2[3]="Sam";
        names2[4]="Tami";


        System.out.println(names2[4]);


    }
}
