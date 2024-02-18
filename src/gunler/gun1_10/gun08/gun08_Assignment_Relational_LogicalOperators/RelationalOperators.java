package gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators;

public class RelationalOperators {
    public static void main(String[] args) {

        int num1=125, num2=45;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // '==' is equal operator
        boolean b =(num1 == num2);
        System.out.println("b = " + b);
        System.out.println("num1 == num2 ?" + (num1==num2));

        // '!=' is not equal operator
        System.out.println("num1 != num2 ?" + (num1!=num2));

        // '>' is larger operator
        System.out.println("num1 > num2 ?" + (num1>num2));

        // '<' is smaller operator
        System.out.println("num1 < num2 ?" + (num1<num2));

        // '>=' is larger or equal   operator
        System.out.println("num1 >= num2 ?" + (num1>=num2));

        // '<=' is smaller or equal   operator
        System.out.println("num1 <= num2 ?" + (num1<=num2));

        System.out.println("------------------------------------");

        String str = "10";
       // System.out.println(num1>str); //error

        double d1 =12.5;
        double d2 =12.5;
        System.out.println(d1>=d2);


    }
}
