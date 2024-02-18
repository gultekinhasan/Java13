package gunler.gun11_20.gun13.gun13_TernaryOperator;

public class TernaryExample2 {
    public static void main(String[] args) {
        int sayi = 0;
        String mesaj = "";

        sayi = 100;
        //if else..
        if(sayi > 50){
            // System.out.println("sayı 50 den büyüktür.");
            mesaj = "sayı 50 den büyüktür."; //true
        }else {
            mesaj = "sayı 50 den küçük veya 50 ye eşittir."; //false
        }
        System.out.println("if else ---> " + mesaj);

        //Ternary operator
        mesaj =(sayi > 50) ? "sayı 50 den büyüktür." : "sayı 50 den küçük veya 50 ye eşittir.";
        System.out.println("Ternary ---> " + mesaj);

        //Çok tercih edilmese de Assignment yapmadan println komutu ile ternary işlem sonucunu ekrana yazdırabiliriz.
        System.out.println("println ---> " + ((sayi > 50) ? "sayı 50 den büyüktür." : "sayı 50 den küçük veya 50 ye eşittir."));
    }
}
