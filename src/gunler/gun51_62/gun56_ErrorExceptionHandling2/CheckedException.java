package gunler.gun51_62.gun56_ErrorExceptionHandling2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        File file = new File("src/gunler/gun51_60/gun56_ErrorExceptionHandling2/Data.txt");
        Scanner dosyaOku = null;
        int sayi = 0;
        try {
            dosyaOku = new Scanner(file);
            System.out.println("Dosyadan kayıtlar okunuyor...");
            while (dosyaOku.hasNext()) {
                //  System.out.println(dosyaOku.nextLine());
                try {
                    sayi = Integer.parseInt(dosyaOku.nextLine());
                    System.out.println(sayi);
                } catch (NumberFormatException nfe) {
                  /*  System.out.println("Integer tipine dönüştürme hatası");
                    System.out.println(nfe);*/
                }
            }
            // one more line read--Olmayan satırı okumaya çalışıyoruz.
            System.out.println(dosyaOku.nextLine());

        } catch (FileNotFoundException fnfe) {
            System.out.println("Hata oluştu: " + fnfe.getMessage());
            System.out.println(fnfe);
        } catch (NoSuchElementException nsee) {
            System.out.println("Olmayan satırı okuma hatası oluştu!!!");
            System.out.println(nsee);
        } catch (NumberFormatException nfe) {
            System.out.println("Integer tipine dönüştürme hatası");
            System.out.println(nfe);
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Program çalışması sona erdi.");
    }
}
