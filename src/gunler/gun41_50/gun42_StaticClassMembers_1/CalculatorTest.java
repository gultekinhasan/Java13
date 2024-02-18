package gunler.gun41_50.gun42_StaticClassMembers_1;

public class CalculatorTest {
    public static void main(String[] args) {

        //calling static method via class name
        double result1 = Calculator.plus(20,10);
        System.out.println("result1 = " + result1);

        double result2 = Calculator.minus(20,10);
        System.out.println("result2 = " + result2);

        Calculator calculator = new Calculator();
        double result3 = calculator.multiply(20,10);

        double sqrt = Math.sqrt(25);
        System.out.println("sqrt = " + sqrt);

        int i = Integer.parseInt("49");
        System.out.println("i = " + i);


    }

}
