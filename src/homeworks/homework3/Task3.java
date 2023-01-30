package homeworks.homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
         */
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter your scores for quiz, midterm and final exam");
        int quiz = input.nextInt();
        int midterm = input.nextInt();
        int finalExam = input.nextInt();

        int averageScore = (quiz+midterm+finalExam)/3;

        if(averageScore >= 90) {
            System.out.println("Grade A");
        } else if (averageScore >=70 && averageScore<90) {
            System.out.println("Grade B");
        } else if (averageScore >= 50 && averageScore <70){
            System.out.println("Grade C");
        } else if (averageScore < 50) {
            System.out.println("Grade F");
        }

    }
}
