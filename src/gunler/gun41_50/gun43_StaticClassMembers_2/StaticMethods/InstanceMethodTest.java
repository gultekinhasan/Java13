package gunler.gun41_50.gun43_StaticClassMembers_2.StaticMethods;

public class InstanceMethodTest {
    public static void main(String[] args) {

        InstanceMethods example = new InstanceMethods();
        example.instanceVar=5;
        example.instanceMethod(); // no error

        InstanceMethods.staticMethod(); // no error

        // instanceMethod2(); // error

        staticMethod2();//no error


    }

    public void instanceMethod2 (){
        System.out.println("Hello World");
    }
    public static void staticMethod2(){
        System.out.println("Hello World");
    }

}
