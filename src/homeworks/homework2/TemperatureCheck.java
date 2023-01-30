package homeworks.homework2;

public class TemperatureCheck {
    public static void main(String[] args) {
        int number = 30;

        if (number < 32){
            System.out.println("Water will freeze with temperature "+number);
        } else {
            System.out.println("Water will not freeze with temperature "+number);
        }
    }
}
