package gunler.gun11_20.gun15.gun15_NestedForLoops;

public class BreakExample {
    public static void main(String[] args) {
        int kapasite = 10;
        int limit =5;
        for (int i=1; i<=kapasite;i++){
            System.out.println(" i'nin şu anki değeri = " + i);
             if (i==limit){
                 System.out.println(" Limitten dolayı durduruldu. ");
                 break;
             }
        }
        System.out.println(" Döngüden çıkıldı. ");
    }
}
