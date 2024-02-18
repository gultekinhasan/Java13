package gunler.gun51_62.gun54_Polymorphism_2.Parent;

public class Test {
    public static void main(String[] args) {

        ChildA childA = new ChildA();
        childA.method1();
        childA.method2();
        childA.method3();

        ChildB childB = new ChildB();
        childB.method1();
        childB.method2();
        childB.method4();

        Parent childA2 = new ChildA();
        childA2.method1();

        Parent childB2 = new ChildB();
        childB2.method1();

        MyInterface childA3 = new ChildA();
        childA3.method2();

        MyInterface childB3 = new ChildB();
        childB3.method2();

    }
}
