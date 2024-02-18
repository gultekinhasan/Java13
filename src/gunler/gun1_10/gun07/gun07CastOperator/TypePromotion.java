package gunler.gun1_10.gun07.gun07CastOperator;

public class TypePromotion {
    public static void main(String[] args) {

            // Arithmetic islemlerde short ve byte turu otomatik olarak int data tipine yukseltiliyor
            short num1 = 10;
            short num2 = 20;
            // short sum = num1 + num2;
            int sum = num1 + num2;
            short sum2 = (short) (num1 + num2);

            System.out.println("sum = " + sum);
            System.out.println("sum2 = " + sum2);

            byte b1 = 2;
            byte b2 = 5;
            // byte b3 = b1 * b2;
            int b3 = b1 * b2;
            byte b4 = (byte) (b1 * b2);
        }
    }

