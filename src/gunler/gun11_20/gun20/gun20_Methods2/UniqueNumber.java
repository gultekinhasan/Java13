package gunler.gun11_20.gun20.gun20_Methods2;

public class UniqueNumber {
    public static void main(String[] args) {

        // Verilen 3 sayi icerisinde kac farkli sayi oldugunu bulan bir method yaziniz

        uniqueNumber(2,5,8);
    }

        public static void uniqueNumber(int a,int b,int c ){

            int sonuc = 0;

            if(a == b && b == c){
                sonuc = 1;
            }else if(a == b || a == c || b == c){
                sonuc = 2;
            }else{
                sonuc = 3;
            }

            System.out.println("Farkli sayi adedi " + sonuc + " dur");

            // sonuc = a == b && b == c ? 1 : a == b || a == c || b == c ? 2 : 3;

            // System.out.println("Farkli sayi adedi " + sonuc + " dur");

        }
}
