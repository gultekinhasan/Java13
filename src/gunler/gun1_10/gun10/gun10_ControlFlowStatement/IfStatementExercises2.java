package gunler.gun1_10.gun10.gun10_ControlFlowStatement;

public class IfStatementExercises2 {
    public static void main(String[] args) {

        // Write a program if the number is a multiplier of 5, the program displays 'Hi Five'.
        // If the number is divisible by 2, it displays/prints 'Hi Even’.
        // Eger sayi 5 in katlari ise 'Hi Five'
        // 2 ye tam olarak bolunebiliyor ise 'Hi Even' yazdiran bir program yaziniz


        int num= 30;

        if (num%5==0){
            System.out.println("hi five");
        }
        if (num %2==0){
            System.out.println("hi even");
        }

        System.out.println("-----------------");

        // Write a program, declare int variable user age. Then program will show us
        // is the user eligible to vote or not.. (Rule: vote age >= 18)
        // USER AGE = 18 "Eligible to vote"
        // Bir kisinin oy kullanmaya uygun olup olmadigini cek eden bir kod yaziniz
        // Kural kisi 18 ve uzeri ise ==> "Oy kullanmaya uygundur"

        int age= -5;
        if (age>=18){
            System.out.println("eligible for vote");
        }
        if (age>=0 && age<18){
            System.out.println("sorry bro");
        }
        if (age<0){
            System.out.println("geçersiz yaş bilgisi...");
        }


        System.out.println("-----------------");
        // Write a Java program to find max number for given numbers
        // number1: 11, number2: 1, number: 33
        // OUTPUT: The max number is: 33
        // Verilen 3 sayi arasinda en buyuk olani bastiran bir program yaziniz


        int num1=11;
        int num2=1;
        int num3=33;

        if(num1>num2 && num1>num3){
            System.out.println("The max number is " + num1);
        }
        if(num2>num1 && num2>num3){
            System.out.println("The max number is " + num2);
        }
        if(num3>num2 && num3>num1){
            System.out.println("The max number is " + num3);
        }
    }
}
