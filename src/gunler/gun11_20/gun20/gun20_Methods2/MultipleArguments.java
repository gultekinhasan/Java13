package gunler.gun11_20.gun20.gun20_Methods2;

public class MultipleArguments {
    public static void main(String[] args) {

        calculation(5,10);

        calculation(10,5);

        // calculation(10);

        // calculation(10,5,3);

    }

    public static void calculation(int num1, int num2){
        int total;
        total = num1 + num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("total = " + total);
    }
}
