package gunler.gun41_50.gun43_StaticClassMembers_2.StaticImport;
import static gunler.gun41_50.gun43_StaticClassMembers_2.StaticImport.MathOperators.*;
public class MathOperatorstTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =5;

//        int sum = MathOperators.add(num1,num2);
//        int difference = MathOperators.substract(num1,num2);
//        int product = MathOperators.multiply(num1,num2);
//        int division = MathOperators.divide(num1,num2);
//        int variable = MathOperators.constantNumber;




        // kendi oluşturduğumuz mathOperators class i static import ederek class'da yer alan static memberlara doğrudan ulasmak mumkun

        int sum =add(num1,num2);
        int difference =substract(num1,num2);
        int product =multiply(num1,num2);
        int division= divide(num1,num2);

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("division = " + division);

        System.out.println("constantNumber = " + constantNumber);

        // STatic olmayan class memberlara static import sonrasi dogrudan erisebilmek mumkun degil
        // int methodValue = method(); // instance method


    }


}
