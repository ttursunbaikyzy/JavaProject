package homework.homework9;

public class Task3InClass {
    public static void main(String[] args) {

        //  You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?

        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
        /*String [] strArr=str.split("[.?!]");
        System.out.println("There are "+strArr.length+" sentences in this string");
        System.out.println(strArr[2]);*/
        System.out.println(str.split("[?]").length); // better approach, doesn't use much memory

        /* can be split by anything, spaces, letters, ?, etc
        String [] arr = str.split(" ");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        */

    }
}
