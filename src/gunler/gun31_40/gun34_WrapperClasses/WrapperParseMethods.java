package gunler.gun31_40.gun34_WrapperClasses;

public class WrapperParseMethods {
    public static void main(String[] args) {
        String str = "123345.678";
        Double doubleSayi = Double.valueOf(str);
        System.out.println("doubleSayi = " + doubleSayi);

        double dblSayi = 0.0;
        dblSayi = Double.parseDouble(str);
        System.out.println("dblSayi = " + dblSayi);

        String strInt = "123645457";
        int sayiInt = Integer.parseInt(strInt);
        System.out.println("sayiInt = " + sayiInt);

        System.out.println();

        //veri yapısı = 1. eleman ---> name
        //veri yapısı = 2. eleman ---> dogumYili
        //veri yapısı = 3. eleman ---> dogumIli
        //veri yapısı = 4. eleman ---> dogumUlkesi

        String str2 = "Şükrü 1984 Ankara Türkiye";
        System.out.println(str2);
        String[] strArr = str2.split(" ");
        System.out.println("Adı               = " + strArr[0]);
        System.out.println("Doğum yılı        = " + strArr[1]);
        System.out.println("Doğum yeri(şehir) = " + strArr[2]);
        System.out.println("Doğum yeri(Ülke)  = " + strArr[3]);
        System.out.println();

        String[] strArray1 = {"Ahmet 1978 İstanbul Türkiye", "Hasan 1975 Berlin Almanya", "Melike 2002 Washington ABD"};
        for (String eleman : strArray1){
            String[] str3 = eleman.split(" ");
            System.out.println("Adı               = " + str3[0]);
            System.out.println("Doğum yılı        = " + str3[1]);
            System.out.println("Doğum yeri(şehir) = " + str3[2]);
            System.out.println("Doğum yeri(Ülke)  = " + str3[3]);
            System.out.println();
        }
    }
}
