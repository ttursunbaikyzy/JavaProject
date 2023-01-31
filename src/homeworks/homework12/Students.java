package homeworks.homework12;

public class Students {
    /* Task 2:
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables.
     */
    String name;
    int historyGrade;
    int mathGrade;
    int geographyGrade;

    Students (String sName, int sHistoryGrade, int sMathGrade, int sGeographyGrade){
        name=sName;
        historyGrade=sHistoryGrade;
        mathGrade=sMathGrade;
        geographyGrade=sGeographyGrade;
    }

    void averageMark () {
        int averageGrade = (historyGrade+mathGrade+geographyGrade)/3 ;
        if( averageGrade >= 90) {
            System.out.println(name+"'s average mark is A");
        } else if (averageGrade >=80 && averageGrade <90) {
            System.out.println(name+"'s average mark is B");
        } else if (averageGrade >=70 && averageGrade<80) {
            System.out.println(name+"'s average mark is C");
        } else if (averageGrade >=50 && averageGrade<70) {
            System.out.println(name+"'s average mark is D");
        } else {
            System.out.println(name+"'s average mark is F");
        }
    }



}
