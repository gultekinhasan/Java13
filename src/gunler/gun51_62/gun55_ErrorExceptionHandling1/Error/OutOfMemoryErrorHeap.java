package gunler.gun51_62.gun55_ErrorExceptionHandling1.Error;
import java.util.ArrayList;

public class OutOfMemoryErrorHeap {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        int counter = 0;

        while (counter < 600_000_000) {
            try {
                counter++;
                stringArrayList.add("Out of Memory Error-Java heap space");
            } catch (OutOfMemoryError hata) {
                System.out.println("HEAP hafıza alanı yetersiz.");
                System.out.println("Hata :" + hata.getMessage());
                //hata.printStackTrace(); //Bütün detaylarıyla hatanın kaynağını yazdırrmak istersek
                //stringArrayList.removeAll(stringArrayList);
                break;
            } catch (Error hata) { //Bu catch bloktan önce yakalanamayan  hataları bu blok yakalasın
                hata.printStackTrace(); //Bütün detaylarıyla hatanın kaynağını yazdırrmak istersek
            }
        }
        System.out.println("counter = " + counter);
    }
}
