package gunler.gun51_62.gun55_ErrorExceptionHandling1.Error;

public class OutOfMemory {
    public static void main(String[] args) {
        String str = "Merhaba Java.";
        System.out.println(str);

        int sayac = 0;
        while (sayac < 30){
            System.out.println(sayac);
            sayac++;
            try {
                str += str;
            }catch (OutOfMemoryError hata){
                System.out.println("Bir hata oluştu!!!");
                System.out.println("Hata: " + hata.getMessage());
            }catch (Error hata){
                hata.printStackTrace();
            }
        }
        System.out.println("Program sona erdi...");
    }
}
