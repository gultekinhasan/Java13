package gunler.gun1_10.gun07.gun07CastOperator;

public class tasks {
    public static void main(String[] args) {

        int num1 = (int) 7.9;
        int num2 = (int) 6.7;
        int sum1 = num1 + num2;
        System.out.println("sum1 = " + sum1);

        System.out.println("");

        int num3 = (int) (7.9+6.7);
        int sum2 = num3;
        System.out.println("sum2 = " + sum2);

        System.out.println("");

        int num4 = 17;
        double sum3 = (double) num4;
        System.out.println("sum3 = " + sum3);

        System.out.println("");

        int num5 = 8;
        int num6 = 3;
        double sum4 = (double) num5 + num6;
        System.out.println("sum4 = " + sum4);

        System.out.println("");

        int num7 = (7);
        int num8 = 2;
        double sum5 = (double) num7/num8;
        System.out.println("sum5 = " + sum5);

        System.out.println("");

        int num9= 7;
        int num10= 2;
        double sum6= (double) num9/num10;
        System.out.println("sum6 = " + sum6);
        System.out.println("");

        int num11 = 15;
        int num12 = 2;
        double num13 = 7.8;
        int sum7= (int) (num13 + (double)num11/num12);
        System.out.println("sum7 = " + sum7);
    }
}
