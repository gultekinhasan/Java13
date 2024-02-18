package gunler.gun11_20.gun20.gun20_Methods2;

public class DifferentParameterTypes {
    public static void main(String[] args) {
        toplama(20.5,30.8,"iki sayının toplamı : ");

        toplama(44.4,40.40,"malatya + kırşehir : ");

        toplama(55.5,40.5,"selam");

        double num1 = 10.5;
        double num2 = 15.5;
        String aaaa = "merhaba";
        toplama(num1,num2,aaaa);


        toplama(4,5,"asdf");


        double num3 = 10.5;
        double num4 = 15.5;
        String aaad = "selam";
        toplama(num3,num4,aaad);

        double num5 = 10.5;
        double num6 = 15.5;
        String aaau = "mera";
        toplama(num5,num6,aaau);

    }
    public static void toplama(double sayi1,double sayi2,String aciklama){
        double toplam = sayi1 + sayi2;
        System.out.println(aciklama + toplam);
    }
}
