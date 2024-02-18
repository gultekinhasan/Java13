package gunler.gun41_50.gun43_StaticClassMembers_2.StaticBlock;

public class Campus {
    private String city;
    static String country;


    static{
        System.out.println("Static Block  - 1");
        country="Almanya";
    }

    public Campus (String city){
        System.out.println("Constructor");
        this.city=city;
    }

    static{
        System.out.println("Static Block - 2");
        country="Ingiltere";
    }
}
