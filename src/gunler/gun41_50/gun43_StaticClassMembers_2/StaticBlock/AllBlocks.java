package gunler.gun41_50.gun43_StaticClassMembers_2.StaticBlock;

public class AllBlocks {


    public AllBlocks(){
        System.out.println("No Argument Constructor");
    }
    public AllBlocks(int sayi){
        System.out.println("One Argument Constructor");
    }
    static {
        System.out.println("Static Block - 1");
    }

    {
        System.out.println("Init Block - 1");
    }

    static {
        System.out.println("Static Block - 2");
    }

    {
        System.out.println("Init Block - 2");
    }
}
