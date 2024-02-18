package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;

public class WhileLoopTest {
    public static void main(String[] args) {
        int sayac = 0;

        while (sayac<10){
            // A noktası --> her zaman true
            System.out.println(" A noktası --> " + (sayac<10) );
            System.out.println(sayac + " Merhaba Java. ");
            sayac++;
            // B Noktası --> her zaman true ancak en son tekrarda false
            System.out.println(" B noktası --> " + (sayac<10) );
        }
        // C Noktası --> her zaman false
        System.out.println(" C noktası --> " + (sayac<10) );

    }
}
