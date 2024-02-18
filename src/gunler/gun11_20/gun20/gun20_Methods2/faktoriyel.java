package gunler.gun11_20.gun20.gun20_Methods2;

public class faktoriyel {
    // Bir sayinin Faktoriyel Degerini bulan bir metot yaziniz.
    public static void main(String[] args) {
    hesaplama(5);
    }
    public static void hesaplama(int number){
        int sonuc =1;
        for (int i = 2; i <= number; i++) {  // 2,3,4
            sonuc *= i;
        }
        System.out.println(sonuc);
    }
}


        // sonuc = sonuc * i -> i2 =2
        //i3 =  sonuc =6
        // i4 = sonuc = 24
       // i5 =120
