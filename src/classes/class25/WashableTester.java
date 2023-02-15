package classes.class25;

public class WashableTester {
    public static void main(String[] args) {
        Washable [] washables={new SmartWatch(), new Inverter(), new Phone()};
        for(Washable w:washables){
            w.wash();
        }
    }
}
