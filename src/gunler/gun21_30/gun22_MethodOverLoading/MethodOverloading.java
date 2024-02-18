package gunler.gun21_30.gun22_MethodOverLoading;

public class MethodOverloading {
    public static void main(String[] args) {
        //default method
        int result = sum(5,10);

        // 1. Method Overloading by changing the number of arguments.
        int result2 = sum(5,10,15);
        int result3 = sum(5,10,15,20);

        // 2. Method Overloading by changing the data type
        double result4 = sum(5.5,10.7);

        //3. Method Overloading by changing the sequence of the arguments.
        double result5 = sum(5,10.5);
        double result6 = sum(5.5,10);




        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);



    }
    //default method
    public static int sum(int a,int b){
        return a + b ;
    }


    // 1. Method Overloading by changing the number of arguments.
    public static int sum(int a, int b,int c){
        return a + b + c ;
    }
    public static int sum(int a, int b,int c,int d){
        return a + b + c + d ;
    }


    // 2. Method Overloading by changing the data type
    public static int sum(double a ,double b){
        return (int) (a+b);
    }

    //3. Method Overloading by changing the sequence of the arguments.
    public static int sum(int a,double b){
        return (int) (a+b);
    }
    public static int sum(double a,int b){
        return (int) (a+b);
    }

    // 4. Method Overloading is NOT possible by changing the return type

    // default method
//    public static int sum(int a, int b){
//        return a + b;
//    }
//
//    public static double sum(int a, int b){
//        return a + b;
//    }



}
