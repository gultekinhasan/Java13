package gunler.gun51_62.gun55_ErrorExceptionHandling1.Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        //Handling with try(){} catch{}
        try {
            //codes which are monitored
            //code throws exception
        }catch (Exception e){
            System.out.println("Hata : " + e.getMessage());
            //Handling the exception
        }

        int sayiA = 35;
        int sayiB = 0;
        int sonuc = 0;
        String mesaj = "";

        //Test-division
        System.out.println("Division Test is started.");
        try {
            sonuc = sayiA / sayiB;
        }catch (ArithmeticException e){
            System.out.println("Hata : " + e.getMessage());
            mesaj = "Bölme işleminde hata oluştu";
           /* sayiB = 1;
            sonuc = sayiA / sayiB;*/
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("sonuc = " + sonuc);
        System.out.println("Test process has ended."  + mesaj);


        //Test-addition
        System.out.println("Addition Test is started.");
        sonuc = sayiA + sayiB;
        System.out.println("sonuc = " + sonuc);
        System.out.println("Test process has ended.");
    }
}
