package homeworks.homework3;

public class Task10 {
    public static void main(String[] args) {

        /*
        Create a boolean variable workDay and assign true create int variable day and assign it to 1
        As long as it is workDay print “I need a day off” and increase day.
        Once day is 6 print “I do not need a day off any more”
         */

        boolean workDay = true;
        int day = 1;

        while (workDay) {
            System.out.println("I need a day off");
            day++;

            if (day>5) {
                workDay=false;
                System.out.println("I do not need a day off anymore");
            }
        }

    }
}
