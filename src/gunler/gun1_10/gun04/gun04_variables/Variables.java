package gunler.gun1_10.gun04.gun04_variables;
/*
   Data Type   Size            Range
   _________   ________        _________________________________________________________________________________________________
   byte        1 byte          Integers in the range of −128 to +127
   short       2 bytes         Integers in the range of −32,768 to +32,767
   int         4 bytes         Integers in the range of −2,147,483,648 to +2,147,483,647
   long        8 bytes         Integers in the range of −9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
   float       4 bytes         Floating-point numbers in the range of ±3.4 × 10^−38 to ±3.4 × 10^38,with 7 digits of accuracy
   double      8 bytes         Floating-point numbers in the range of ±1.7 × 10^−308 to ±1.7 × 10^308,with 15 digits of accuracy
   boolean     1 bit           true or false
    */

public class Variables {
    public static void main(String[] args) {
        System.out.println("Varibles in JAVA");
        // dataType variableName;  // camelCase
        boolean gectiMi; // true | false
        boolean evliMi;
        byte sınıfNo;
        short urunKatagoriNo;
        int salary;
        long bankaMusterilerBakiyesi;

        float kdvOrani;
        double buyukOndalikliBirSayi;


        gectiMi = true;
        evliMi = false;

        System.out.println("sınıfı geçti mi?" + gectiMi);
        System.out.println("evli mi?" + evliMi);
        System.out.println("");

        // byte -128 ile 127
        sınıfNo= 126;
        System.out.println("sınıf numarası :" + sınıfNo);

        // short - Integers in the range of -32,768 to +32,767
        urunKatagoriNo= 3290;
        System.out.println("urun katagori no :" + urunKatagoriNo);

        //int - Integers in the range of -2,147,483,648 to +2,147,483,647
        salary= 2_130_567_968; // büyük sayıları okunaklı yapmak için _ (alttire) karakteri ayraç olarak kullanılabilir
        System.out.println("Maaş Bilgisi:" + salary);
        System.out.println();


        //long- Integers in the range of −9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
        bankaMusterilerBakiyesi = 1_237_861_878_346_958_734L;  //l or L to make it long
        System.out.println("Müşterileirin toplam bakiyesi : " + bankaMusterilerBakiyesi);
        System.out.println();

        //Floating point numbers type
        //float -Floating-point numbers in the range of ±3.4 × 10^−38 to ±3.4 × 10^38,with 7 digits of accuracy
        kdvOrani = 0.18f; //f or F for float dataType
        System.out.println("KDV oranı  = " + kdvOrani);
        kdvOrani = 3403424239883478927.48274887427349872343492328923985f;
        System.out.println("KDV oranı  = " + kdvOrani);
        System.out.println();

        //double -Floating-point numbers in the range of ±1.7 × 10^−308 to ±1.7 × 10^308,with 15 digits of accuracy
        buyukOndalikliBirSayi = 374874983489573489092.40934807676992834057893428727892;
        System.out.println("buyukOndalikliBirSayi = " + buyukOndalikliBirSayi);


    }
}
