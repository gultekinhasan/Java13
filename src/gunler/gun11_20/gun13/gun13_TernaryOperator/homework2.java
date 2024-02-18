package gunler.gun11_20.gun13.gun13_TernaryOperator;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;
        int passingNote =50;
        String success;
        String student;

        System.out.print("Please Write your name : ");
        student = scanner.next();

        System.out.print("Write your score below to check if you passed or failed : ");
        score = scanner.nextInt();

        success = (score>=50 && score<=100) ? "passed.": ("failed. you need " + (passingNote-=score) + " more point to pass the exam.");
        System.out.println("your mark is "+ score + " and you " + success );
    }
}

/* write a program that checks if a student passed the exam or not by using ternary operator.
    sample 1 : your mark is 80 and you passed.
    sample 2 : your mark is 45 and you failed. you needed 5 more point to pass the exam.
     */