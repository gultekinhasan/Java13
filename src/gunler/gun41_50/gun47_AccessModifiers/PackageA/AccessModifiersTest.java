package gunler.gun41_50.gun47_AccessModifiers.PackageA;

public class AccessModifiersTest {
    public static void main(String[] args) {


        //Same package default-protected-public
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.defaultMethod();
        accessModifiers.defaultStr="default";
        accessModifiers.protectedStr="Protected"; // same package all classes can access
        accessModifiers.publicStr="public";

    }
}
