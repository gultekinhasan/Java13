package gunler.gun11_20.gun20.gun20_Methods2;

public class LocalVariables {
    public static void main(String[] args) {

     calculation(5,10);
     calculation2(5,10);

        // same name local variable


        //int sum = 1;
    }

    public static void calculation(int num1,int num2){
        //local variable
        int sum;
        sum=num1+num2;
        System.out.println("sum = " + sum);
    }
    public static void calculation2(int num1,int num2){
        //another local variable
        int sum;
        sum=num1+num2;
        System.out.println("sum = " + sum);
    }
}
