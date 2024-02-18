package gunler.gun11_20.gun20.gun20_Methods2;

public class ReturnType {
    public static void main(String[] args) {

        System.out.println(hesaplama(1, 2));

        int sonuc = hesaplama(1,2);
        System.out.println("sonuc = " + sonuc);

    }

    public static int hesaplama(int sayi1, int sayi2){
        int toplam;
        toplam = sayi1 + sayi2;

        return toplam;
    }
}
