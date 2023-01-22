package classes.class12;

public class Task6 {
    public static void main(String[] args) {

        /*
        Create 2D array of countries: north america countries, south america countries,
        europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and
        calculate how many total countries been stored.
         */

        String [][] countries={{"USA","Canada","Mexico",},
                {"Brazil", "Argentina", "Venezuela", "Colombia"},
                {"Germany","Italy","France","Serbia","Russia","UK"},
                {"China","India","Japan","Russia"},
                {"Egypt", "Nigeria", "South Africa","Ethiopia"}
        };

        int counter=0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                counter++;
            }
            System.out.println();
        }

        System.out.println("Total countries "+counter);

        System.out.println("**********************");

        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
                counter++;
            }
            System.out.println();
        }




    }
}
