package gunler.gun21_30.gun21_Review;

public class VarArgs {
    public static int ikiSayiTopla(int sayi1,int sayi2){
        return sayi1 + sayi2;
    }

    public static int ucSayiTopla(int sayi1,int sayi2,int sayi3){
        //return sayi1 + sayi2 + sayi3;
        return ikiSayiTopla(sayi1,sayi2) + sayi3;
    }


    //Variable arguments-VARARGS-Önceden bellirili olmayan 1 veya daha fazla sayıda değişen sayıda parametre alan metodlar
    //Parametre bir array(dizi) veri yapısı olarak metoda gönderilir
    public static int varTopla(int ...sayilar){ //Değişen sayıda parametre(varargs) alan metodlar.
        int toplam = 0;
        System.out.println("Toplam " + sayilar.length + " adet parametre gönderdiniz."); //Parametrenin kaç elemanı olduğunu ekrana yazar
        for (int i = 0; i < sayilar.length; i++) {
            //System.out.println(i + ". sayi---> " + sayilar[i]);
            toplam += sayilar[i];
        }
        return toplam;
    }

    public static void varStr(String... kelimeler){
        for (int i = 0; i < kelimeler.length; i++) {
            System.out.print(kelimeler[i] + " ");
        }
    }
    public static void main(String[] args) {
        int toplam = ikiSayiTopla(5,7);
        System.out.println("toplam = " + toplam);

        toplam = ucSayiTopla(2,5,7);
        System.out.println("toplam = " + toplam);

        toplam = varTopla(2,5,10,5000,2323);
        System.out.println("toplam = " + toplam);

        varStr("Ahmet","Mehmet","Ali","Veli");
    }
}
