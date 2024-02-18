package gunler.gun11_20.gun19.gun19_Methods1;

public class DebuggingMethodCall {
    public static void main(String[] args) {


        System.out.println("Main method içerisindeyim : line 7");
        method();
        System.out.println("main method içerisindeyim : line 9");
        method2();
        System.out.println("main method içerisindeyim : line 11");
        method();
        System.out.println("main method içerisindeyim : line 13");
        method2();
        System.out.println("main method içerisindeyim : line 15");
    }


    public static void method(){
        System.out.println("Method içerisindeyim : line 19");
    }
    public static void method2(){
        System.out.println("Method2 içerisindeyim : line 22");
    }

}
