package gunler.gun1_10.gun10.gun10_ControlFlowStatement;

public class IfElseStatementExercises {
    public static void main(String[] args) {

            // Write a program, declare int variable user age. Then program will show us
            // is the user eligible to vote or not.. (Rule: vote age >= 18)
            // USER AGE = 18 "Eligible to vote"
            // USER AGE = 17 "Not eligible to vote"
            // Bir kisinin oy kullanmaya uygun olup olmadigini cek eden bir kod yaziniz
            // Kural kisi 18 ve uzeri ise ==> "Oy kullanmaya uygundur"
            // Kural kisi 18 den asagi ise ==> "Oy kullanmaya uygun degildir"

            int age = 17;

            if(age >= 18){
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }


            // Write a program that calculates the area of a circle
            // Bir dairenin alanini hesaplayan bir program yaziniz

            int radius = 5;
            double area = 0;
            double pi = 3.14;

            if(radius > 0){
                area = pi * radius * radius;
                System.out.println("area = " + area);
            } else {
                System.out.println("This is not a circle");
            }
        // Write a Java program to check and print whether given number is positive or negative
        // Verilen sayinin pozitif veya negatif sayi oldugunu tespit eden bir program yaziniz

        int number = -11;

        if(number > 0){
            System.out.println(number + " pozitif bir sayidir");
        } else {
            System.out.println(number + " negatif bir sayidir");
        }

        // Write a program to checks whether a number is even or odd
        // Verilen sayinin tek veya cift oldugunu tespit eden bir program yaziniz

        int num = 221349879;

        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }

        // Write an if statement that increases pay by 3% if score is greater than 90
        // otherwise increases pay by 1%
        // Eger score 90 dan buyuk ise, odemeyi %3, degil ise %1 arttiran bir if statement yaziniz

        int score = 90;
        int pay = 1000;

        if(score > 90){
            pay += (pay * 3 / 100);
        } else {
            pay += (pay * 1 / 100);
        }

        System.out.println("pay = " + pay);


        // Write an if statement that checks multiple conditions using logical operaters for a student
        // and decide if student is eligible for discount
        // age >= 18 checks if the age is greater than 18 or equal
        // age <= 30 checks if the student is less than 30 or equal
        // isStudent checks if the boolean is correct or not
        // Output : "You are eligible for student discount"
        // Output : "Sorry, you are not eligible for student discount"

        // Bir kisinin 18 ve 30 yas araliginda bir ogrenci olmasi durumunda indirimden faydalanabilecegi
        // bunlarin herhangi birisni saglamadiginda ise indirimden faydalanamayacagini belorten bir if statement yazninz

        int age1 = 35;
        boolean isStudent= true;

        if ((age1>=18 & age1<=30) && isStudent){
            System.out.println("You are eligible for student discount" );
        } else {
            System.out.println("Sorry,you're not eligible for student discount");
        }

        
        
    }
}
