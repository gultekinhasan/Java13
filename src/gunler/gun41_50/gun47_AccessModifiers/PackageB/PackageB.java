package gunler.gun41_50.gun47_AccessModifiers.PackageB;
import gunler.gun41_50.gun47_AccessModifiers.PackageA.AccessModifiers;
public class PackageB {
    public static void main(String[] args) {
        AccessModifiers accessModifiers=new AccessModifiers();

        // different package only public members can be access
        accessModifiers.publicStr="public";
        accessModifiers.publicMethod();


    }
}
