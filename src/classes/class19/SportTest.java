package classes.class19;

public class SportTest {
    public static void main(String[] args) {

        Cricket crick=new Cricket("Cricket","Pakistan","Green helmet");
        crick.display();
        crick.displayInfo();

        Soccer soc=new Soccer("Soccer","Argentina","Oliver's",12);
        soc.display();
        soc.displayTeam();


    }
}
