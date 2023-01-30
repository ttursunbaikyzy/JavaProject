package homeworks.homework6;

public class Task6 {
    public static void main(String[] args) {

        // Create an array of countries. While retrieving all values from an array
        // print capital for each country choose any five countries.

        String [] countries = {"USA","Malaysia","Italy","Egypt","Kyrgyzstan"};

        String capital;

        for (int i = 0; i < countries.length; i++) {

            switch (countries[i]){
                case "USA":
                    capital="Washington DC";
                    System.out.println("The capital of "+countries[i]+" is "+capital);
                    break;
                case "Malaysia":
                    capital="Kuala Lumpur";
                    System.out.println("The capital of "+countries[i]+" is "+capital);
                    break;
                case "Italy":
                    capital="Rome";
                    System.out.println("The capital of "+countries[i]+" is "+capital);
                    break;
                case "Egypt":
                    capital="Cairo";
                    System.out.println("The capital of "+countries[i]+" is "+capital);
                    break;
                case "Kyrgyzstan":
                    capital="Bishkek";
                    System.out.println("The capital of "+countries[i]+" is "+capital);
                    break;
            }
        }

    }
}
