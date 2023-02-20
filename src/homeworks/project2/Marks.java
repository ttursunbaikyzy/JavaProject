package homeworks.project2;

public abstract class Marks {
    abstract void getPercentage();
}

class A extends Marks{
    int historyGrade;
    int mathGrade;
    int geographyGrade;
    A(int historyGrade, int mathGrade, int geographyGrade) {
        this.historyGrade = historyGrade;
        this.mathGrade = mathGrade;
        this.geographyGrade = geographyGrade;
    }
    void getPercentage () {
        int averageGrade = (historyGrade+mathGrade+geographyGrade)/3 ;
        if( averageGrade >= 90) {
            System.out.println("Student A's average mark is A");
        } else if (averageGrade >=80 && averageGrade <90) {
            System.out.println("Student A's average mark is B");
        } else if (averageGrade >=70 && averageGrade<80) {
            System.out.println("Student A's average mark is C");
        } else if (averageGrade >=50 && averageGrade<70) {
            System.out.println("Student A's average mark is D");
        } else {
            System.out.println("Student A's average mark is F");
        }
    }

}

class B extends Marks{
    int historyGrade;
    int mathGrade;
    int geographyGrade;
    int biologyGrade;

    B(int historyGrade, int mathGrade, int geographyGrade, int biologyGrade) {
        this.historyGrade = historyGrade;
        this.mathGrade = mathGrade;
        this.geographyGrade = geographyGrade;
        this.biologyGrade=biologyGrade;
    }

    void getPercentage () {
        int averageGrade = (historyGrade+mathGrade+geographyGrade+biologyGrade)/4 ;
        if( averageGrade >= 90) {
            System.out.println("Student B's average mark is A");
        } else if (averageGrade >=80 && averageGrade <90) {
            System.out.println("Student B's average mark is B");
        } else if (averageGrade >=70 && averageGrade<80) {
            System.out.println("Student B's average mark is C");
        } else if (averageGrade >=50 && averageGrade<70) {
            System.out.println("Student B's average mark is D");
        } else {
            System.out.println("Student B's average mark is F");
        }
    }

}


