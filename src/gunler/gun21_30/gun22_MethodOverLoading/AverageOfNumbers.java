package gunler.gun21_30.gun22_MethodOverLoading;

public class AverageOfNumbers {
    public static void main(String[] args) {

        // 3 farkli data turunde 3 sayinin ortalamasini hesaplayan ayni isimde methodlar olusturunuz

        int averageNumbers = averageOfNumbers(1,2,3);
        double averageNumbers2 = averageOfNumbers(1.1,2.2,3.3);
        long averagenumbers3 = averageOfNumbers(1000000000l,2000000000l,3000000000l);

        System.out.println("averageNumbers = " + averageNumbers);
        System.out.println("averageNumbers2 = " + averageNumbers2);
        System.out.println("averagenumbers3 = " + averagenumbers3);

    }

    public static int averageOfNumbers(int a, int b, int c){
        int average = (a + b + c) / 3;
        return average;
    }

    public static double averageOfNumbers(double a, double b, double c){
        double average = (a + b + c) / 3;
        return average;
    }

    public static long averageOfNumbers(long a, long b, long c){
        long average = (a + b + c) / 3;
        return average;
    }

}
