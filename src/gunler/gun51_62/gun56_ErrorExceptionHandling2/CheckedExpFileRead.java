package gunler.gun51_62.gun56_ErrorExceptionHandling2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExpFileRead {

    public static void main(String[] args) {
        File file = new File("src/gunler/gun51_60/gun56_ErrorExceptionHandling2/Data.txt");
        Scanner dosyaOku = null;

        try {
            dosyaOku = new Scanner(file); //Okunacak bir dosya bulundu ise

            while (dosyaOku.hasNext()){ //Dosyayı satır satır oku
                System.out.println(dosyaOku.nextLine());
            }

        } catch (FileNotFoundException fnfe) {
            //Sistemde beliritilen bir dosya bulunamazsa bu block çalışır
            System.out.println(fnfe);
        } catch (Exception e){
            //Yukarıdaki catch blockmlarında yakalanamayan exception durumları olursa bu block yakalayacak
            System.out.println(e);
        }

        System.out.println("*** DOSYA OKUMA İŞLEMİ BAŞARI İLE TAMAMLANDI ***");
    }
}
