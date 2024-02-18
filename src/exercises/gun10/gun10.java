package exercises.gun10;

public class gun10 {
    public static void main(String[] args) {
        // write a if statement that multiplies salary by 1.5 if hours is greater than 38 hours
        int salary = 100;
        int hours = 39;
        salary *= 1.5;
        if (hours>38){
            System.out.println("salary = " + salary);
        }
        System.out.println("--------------------------");
        //write an if statement that assigns 1 to x if y is greater than 0
        int x=1;
        int y = 3;
        if (y>0){
            System.out.println("x = " + x);
        }
        System.out.println("----------------------------");
        // Write a program if the number is a multiplier of 5, the program displays 'Hi Five'.
        // If the number is divisible by 2, it displays/prints 'Hi Even’.
        // Eger sayi 5 in katlari ise 'Hi Five'
        // 2 ye tam olarak bolunebiliyor ise 'Hi Even' yazdiran bir program yaziniz

        int a  = 40;

        if (a%5==0){
            System.out.println("Hi Five");
        }
        if (a%2==0){
            System.out.println("Hi Even");
        }















    }

}
