package gunler.gun11_20.gun20.gun20_Methods2;
public class HesapMakinesi {
    public static void main(String[] args) {

            // Hesap Makinesi islevi goren bir method yaziniz

            int islemSonucu;

            islemSonucu = hesapMakinesi(10,2,'+');
            System.out.println("islemSonucu = " + islemSonucu);

            islemSonucu = hesapMakinesi(10,2,'-');
            System.out.println("islemSonucu = " + islemSonucu);

            islemSonucu = hesapMakinesi(10,2,'*');
            System.out.println("islemSonucu = " + islemSonucu);

            islemSonucu = hesapMakinesi(10,2,'/');
            System.out.println("islemSonucu = " + islemSonucu);

            islemSonucu = hesapMakinesi(10,2,'$');
            System.out.println("islemSonucu = " + islemSonucu);


        System.out.println(hesapMakinesi(5,10,'+'));

        }
        public static int hesapMakinesi(int sayi1, int sayi2, char islem){
            int sonuc = 0;

            switch(islem){
                case '+':
                    sonuc = sayi1 + sayi2;
                    break;
                case '-':
                    sonuc = sayi1 - sayi2;
                    break;
                case '*':
                    sonuc = sayi1 * sayi2;
                    break;
                case '/':
                    sonuc = sayi1 / sayi2;
                    break;
                default:
                    sonuc = -10000;
            }
            return sonuc;
        }
    }

