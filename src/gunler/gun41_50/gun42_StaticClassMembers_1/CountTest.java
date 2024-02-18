package gunler.gun41_50.gun42_StaticClassMembers_1;

public class CountTest {
    public static void main(String[] args) {

        Count obj1 = new Count();
        Count obj2 = new Count();
        Count obj3 = new Count();

        int objCount;

        objCount = obj1.getInstanceCount();
        objCount = obj2.getInstanceCount();

        System.out.println("objCount = " + objCount);

        // static variable a class name ile doğrudan ulaşabilmek mümkün..
        System.out.println("instanceCount : " + Count.instanceCount);



    }
}
