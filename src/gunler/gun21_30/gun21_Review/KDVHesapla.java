package gunler.gun21_30.gun21_Review;

public class KDVHesapla {

    public static void kasaFisiAltlık(){
        System.out.println("--------------------------");
        System.out.println("Bizi Tercih Ettiğiniz Teşekkür Ederiz..");
    }

    public static void kasaFisiBaslik(){
        System.out.println("     ABC MARKET KASA FİSİ"     );
        System.out.println("Satın Alınan Ürünlerin Listesi");
        System.out.println("------------------------------");
    }

    public static int kdvHesapla(int miktar,double fiyat){
     //   System.out.println("KDV Hesapla Metodu...");

        double kdvliHesap = 0;
        kdvliHesap = (miktar * fiyat) * 1.18;

       // System.out.println(kdvliHesap);

     return (int) kdvliHesap;
    }

    public static void main(String[] args) {
        String product = "";
        int amount = 0;
        double price = 0;

        product = "Elma";
        amount = 3;
        price = 15;
        double hesap1 = kdvHesapla(amount,price);

        product = "zeytin";
        amount = 2;
        price =145;
       double hesap2 = kdvHesapla(amount,price);


       kasaFisiBaslik();
        System.out.println("hesap1 = " + hesap1);
        System.out.println("hesap2 = " + hesap2);
        double toplamAlısveris = hesap1+hesap2;
        System.out.println("toplamAlısveris = " + toplamAlısveris);
        kasaFisiAltlık();

    }
}
