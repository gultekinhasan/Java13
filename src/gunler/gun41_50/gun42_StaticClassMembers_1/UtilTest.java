package gunler.gun41_50.gun42_StaticClassMembers_1;
public class UtilTest {

    public static void main(String[] args) {

        int num = 5;
        double celcius = 24.5;
        double fahreneit = 68.7;

        // Calling static method 'factorial'
        int factorialResult = MathUtils.factorial(num);
        System.out.println("Factorial of " + num + " is: " + factorialResult);

        // Calling static method 'isPrime'
        boolean isPrime = MathUtils.isPrime(num);
        System.out.println(num + " is" + (isPrime ? " " : " not ") + "a prime number");

        // Calling static method 'celciusToFahreneit'
        double convertedToFahreneit = MathUtils.celciusToFahreneit(celcius);
        System.out.println(celcius + " C is equal to " + convertedToFahreneit + " F");

        // Calling static method 'fahreneitToCelcius'
        double convertedToCelcius = MathUtils.fahreneitToCelcius(fahreneit);
        System.out.println(fahreneit + " F is equal to " + convertedToCelcius + " C");

    }
}