package gunler.gun31_40.gun35_Review;
import java.math.BigInteger;

public class LargeFactorialBigInteger {
    public static void main(String[] args) {
        System.out.println("25! is(BigInteger) \n" + factorial(250L)); //it can calculate any number as an argument of long type and return result is almost limitless
        System.out.println();
        System.out.println("25! is(long)  \n" + factorial(25)); //it has certain limit. Return result is Limited to long dataType limit
    }

    //BigInteger class type
    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE; // new BigInteger("1");
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));
        return result;
    }

    //Primitive dataType
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++)
            result = result * i;
        return result;
    }
}
