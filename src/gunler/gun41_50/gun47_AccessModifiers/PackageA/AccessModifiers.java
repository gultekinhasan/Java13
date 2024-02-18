package gunler.gun41_50.gun47_AccessModifiers.PackageA;

public class AccessModifiers {
    private String privateStr; //within same class all members can access  --> special to Class
    String defaultStr; // Default -- within same package all class can access.
    protected String protectedStr; // same package and other classes which has inheritance relationship
    public String publicStr; //All classes can access

    private void privateMethod(){
        privateStr="private";
        protectedStr= "protected";
        defaultStr="default";
        System.out.println("private method called");

    }
    void defaultMethod(){
        privateStr="private";
        protectedStr="protected";
        defaultStr="default";
        privateMethod();

        System.out.println("default method called");

    }
    protected void protectedMethod(){
        System.out.println("protectedStr = " + protectedStr);
    }

    public void publicMethod(){
        System.out.println("publicStr = " + publicStr);
    }
}
