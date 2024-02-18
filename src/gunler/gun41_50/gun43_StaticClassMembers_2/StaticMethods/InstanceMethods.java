package gunler.gun41_50.gun43_StaticClassMembers_2.StaticMethods;

public class InstanceMethods {

    // instance variable
    int instanceVar =10;

    static int staticVar =10;

    public void instanceMethod (){
        //Access instance variable dirctly within an instance method
        System.out.println("Instance variable value : " + instanceVar);
        System.out.println("Instance variable value : " + this.instanceVar);

        //Access instance variable dirctly within an instance method
        System.out.println("Instance variable value : = " + staticVar);
    }
    public static void staticMethod(){
        // cannot access instance variable directly within a static method
        //System.out.println("Instance variable value : " + instanceVar);
        //System.out.println("Instance variable value : " + this.instanceVar);

        //Access instance variable dirctly within an instance method
        System.out.println("Instance variable value : = " + staticVar);
    }
}
