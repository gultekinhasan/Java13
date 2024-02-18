package gunler.gun41_50.gun49_FinalKeyword_VarMethodHiding.FinalKeyword;

public class FinalMethods {

    public final void method1(){
        System.out.println("Super class Method 1");
    }
}

class Sub extends FinalMethods{
//    public void method1(){
//        System.out.println("sub class method 1");
//     }
    public void method2(){
        System.out.println("132131");
    }

}
class main {
    public static void main(String[] args) {
        Sub sub = new Sub();

        sub.method1();
        sub.method2();
    }
}
