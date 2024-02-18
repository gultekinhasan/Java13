package gunler.gun11_20.gun20.gun20_Methods2;

public class TypeCompatibility {
    public static void main(String[] args) {

        displayNumber(10);

        // long değer göndermez error verir.
        // displayNumber(100000000000);

        // double değer göndermez error verir.
       /* double number= 10.5;
        displayNumber(number); */

        //type promotion
        short num =1;
        displayNumber(num);

        // explicit casting
        double num2 = 25.7;
        displayNumber((int)num2);

    }

    public static void displayNumber(int number){
        System.out.println("Value Of Number : " + number);
    }
}
