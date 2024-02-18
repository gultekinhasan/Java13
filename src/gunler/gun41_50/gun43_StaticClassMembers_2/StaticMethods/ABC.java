package gunler.gun41_50.gun43_StaticClassMembers_2.StaticMethods;

public class ABC {
    //object oluşturmadan instance ve methodlarına ulaşacak vir class yapabilmek icin?
    // object ile ulasılmasin
    static int instance =10;

    private ABC(){

    }

    public static void method1(){
        System.out.println("Method1");
    }
    public static void method2(){
        System.out.println("Method2");
    }
}
