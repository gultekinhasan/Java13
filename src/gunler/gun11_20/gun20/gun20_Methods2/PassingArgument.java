package gunler.gun11_20.gun20.gun20_Methods2;

public class PassingArgument {
    public static void main(String[] args) {
    // passing value directly
    displayValue(5);

    // passing value with variable
    int num = 10;
    displayValue(num);

        // passing value using same name with parameter
        int number = 11;
        displayValue(num);

    displayValue(10+5%3*8);

    //error / parantez içinde bir daha int yazılmaz
   // displayValue(int num);

    }

    public static void displayValue(int number){
        System.out.println("Value is : " + number);
    }
}
