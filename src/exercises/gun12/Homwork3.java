package exercises.gun12;


import java.util.Scanner;

    public class Homwork3 {
        public static void main(String[] args) {
        /*Write a program that accepts name, age and checks if a candidate is selected for job by using
        ternary operator:
        Sample1: Hi Ahmet Yilmaz you are selected as QA Engineer
        Sample2: Hi Ahmet Yilmaz you are not selected as QA Enginee

         */
            Scanner veriGir = new Scanner(System.in);


            String A= "master";
            String B= "university";
            String C= "high school";
            String D= "primary school";

            String level;
            int age;
            String result;


            System.out.print("Please write your  age : ");
            age = veriGir.nextInt();

            System.out.print("please write your level : ");
            level = veriGir.next();

            result = ((age <= 35) && (level !=A)) ? " you are not " : " you are  " ;


            System.out.println("Hi Ahmet Yılmaz "  + result + "selected as a QA Engineer");


        }
    }

