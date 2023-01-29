package classes.class15;

public class MPractice6 {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    /*
    return type => String
    name of the method => createEmail
    parameters => String first name, String lastName, String emailType
    {
    concat
    }
     */

    String createEmail(String firstName, String lastName, String emailType) {
        return firstName.toLowerCase()+lastName.toLowerCase()+"@"+emailType.toLowerCase()+".com";
    }

    public static void main(String[] args) {
        MPractice6 mp = new MPractice6();
        System.out.println(mp.createEmail("Tami","Estaniss","gmail"));
    }



}
