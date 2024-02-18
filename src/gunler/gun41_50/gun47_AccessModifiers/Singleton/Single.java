package gunler.gun41_50.gun47_AccessModifiers.Singleton;

public class Single {
    private static Single singleInstance = null;
    private Single(){

    }
    public static Single getInstance(){
        System.out.println("getInstance Method Called ");
        if (singleInstance==null){
            System.out.println("Instance Created");
            singleInstance= new Single();
        }
        return singleInstance;
    }

}
