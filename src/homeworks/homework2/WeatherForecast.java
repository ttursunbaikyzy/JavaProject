package homeworks.homework2;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your city");
        String city = input.nextLine();

        System.out.println("Please enter the current weather temperature in your city");
        int tempF = input.nextInt();
        double tempC = (tempF-32) * 0.5556;

        System.out.println("The temperature is "+tempC+" the city is "+city);

    }
}
