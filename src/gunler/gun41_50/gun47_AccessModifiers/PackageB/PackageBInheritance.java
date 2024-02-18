package gunler.gun41_50.gun47_AccessModifiers.PackageB;

import gunler.gun41_50.gun47_AccessModifiers.PackageA.AccessModifiers;

public class PackageBInheritance extends AccessModifiers {
    public static void main(String[] args) {
        PackageBInheritance obj = new PackageBInheritance();
        // different package but inheritance relationship exists only public and protected members can be accessed
        obj.protectedStr="Protected String";
        obj.publicStr="Public String";
        obj.publicMethod();
        obj.protectedMethod();
    }
}
