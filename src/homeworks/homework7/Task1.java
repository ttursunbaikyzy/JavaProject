package homeworks.homework7;

public class Task1 {
    public static void main(String[] args) {

        // Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
        //Then your program should print name of the students that has A and B grade

        String [][] students = {{"Sam", "Tami", "Rana", "Kami"},
                                {"A", "B", "D", "C"}
        };

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                if (students[i][j].equals("A") || students[i][j].equals("B")){
                    System.out.println(students[0][j]);
                }
            }
        }

    }
}
