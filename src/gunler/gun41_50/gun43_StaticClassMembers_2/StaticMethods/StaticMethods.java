package gunler.gun41_50.gun43_StaticClassMembers_2.StaticMethods;

public class StaticMethods {

    static String name = "Ahmet";

    public static void show1(){
      //  show2();// cannot call instance method from static method
        show4(); // can call static method from static method
        System.out.println(name);// can reach a static variable from a static method
    }
    public void show2(){
        show1(); // can call static method from an instance method
        show3(); // can call instance method from an instance method
        System.out.println(name);// can reach static variable from an instance method
    }
    public void show3(){
        show2();// can call instance method from an instance method
        show1();// can call static method from an instance method


    }
    public static void show4(){
        show1(); // can call static method from static method
        // show2(); // cannot call instance method from static method

    }

}
