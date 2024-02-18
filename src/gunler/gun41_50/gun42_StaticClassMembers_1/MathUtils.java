package gunler.gun41_50.gun42_StaticClassMembers_1;



public class MathUtils {

    // Static method to calculate factorial of a number
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }

    // Static method to check if a number is prime
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double celciusToFahreneit(double celcius){
        return (celcius * 9/5) + 32;
    }

    public static double fahreneitToCelcius(double fahreneit){
        return (fahreneit - 32) * 5/9;
    }

}