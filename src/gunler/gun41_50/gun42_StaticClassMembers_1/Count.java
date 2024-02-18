package gunler.gun41_50.gun42_StaticClassMembers_1;

public class Count {
    static int instanceCount = 0;

    public Count (){
        //static int instanceCount = 0; // static variable constructor içerisinde kullanılamaz.
        instanceCount++;
    }

    public int getInstanceCount(){
        //static int instanceCount = 0; // static variable instance method içerisinde kullanılamaz.

        return instanceCount;
    }

}
