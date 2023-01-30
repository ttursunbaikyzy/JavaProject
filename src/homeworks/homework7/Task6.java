package homeworks.homework7;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        // Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        //Then print all values from that array using 2 different loops and calculate how many total countries been stored

        String[][] countries = {{"Canada", "USA", "Dominican Republic"},
                {"Brazil", "Colombia", "Argentina"},
                {"Italy", "France", "United Kingdom"},
                {"Malaysia", "Kyrgyzstan", "Thailand"},
                {"Egypt", "Tanzania", "South Africa"}
        };

        for (String[] countriesList : countries) {
            System.out.println(Arrays.toString(countriesList) + " ");
        }

        System.out.println("************************************");

        int total = 0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                total++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The total number of countries is: "+total);

    }
}