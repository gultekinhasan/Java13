package gunler.gun41_50.gun47_AccessModifiers.Singleton;

public class SingleTest {
    public static void main(String[] args) {
        Single single1 =Single.getInstance();
        Single single2 =Single.getInstance();
        Single single3 =Single.getInstance();
        Single single4 =Single.getInstance();
        Single single5 =Single.getInstance();

        System.out.println("System.identityHashCode(single1) = " + System.identityHashCode(single1));
        System.out.println("System.identityHashCode(single2) = " + System.identityHashCode(single2));
        System.out.println("System.identityHashCode(single3) = " + System.identityHashCode(single3));
        System.out.println("System.identityHashCode(single4) = " + System.identityHashCode(single4));
        System.out.println("System.identityHashCode(single5) = " + System.identityHashCode(single5));
    }
}
