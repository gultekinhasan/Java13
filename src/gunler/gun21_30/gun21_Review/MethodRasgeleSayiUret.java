package gunler.gun21_30.gun21_Review;

public class MethodRasgeleSayiUret {
    public static int rastgeleSayiUret(int baslangic, int bitis) {
        int rastgeleSayi;
        rastgeleSayi = (int) (Math.random() * (bitis - baslangic + 1)) + baslangic; //baslangic ve bitis dahil
        //  System.out.println(rastgeleSayi);
        return rastgeleSayi;
    }

    public static void rastgeleAdetliSayiUret(int baslangic, int bitis, int adet, boolean ciftMi, int lastDigit) {
        int counter = 0;
        while (counter < adet) {
            int sayi = rastgeleSayiUret(baslangic, bitis);
            if(ciftMi){
                if (sayi % 2 == 0 && sayi % 10 == lastDigit) {
                    counter++;
                    System.out.println(counter + "---> " + sayi);
                }
            }else {
                if (sayi % 2 != 0 && sayi % 10 == lastDigit) {
                    counter++;
                    System.out.println(counter + "---> " + sayi);
                }
            }
        }
    }

    public static void main(String[] args) {
        //       rastgeleSayiUret(5,10);
        //        rastgeleSayiUret(5,10);
        //        rastgeleSayiUret(5,10);
        //        rastgeleSayiUret(5,10);
        //        rastgeleSayiUret(5,10);
        //        rastgeleSayiUret(5,10);

        for (int i = 0; i < 10; i++) {
            System.out.println("i : " + i + " ---> " + rastgeleSayiUret(10000, 90000));
        }

        //Tek sayı üret
      /*  for (int i = 0; i < 10; i++) {
            int sayi = rastgeleSayiUret(10000, 90000);
            if (sayi % 2 != 0) {
                System.out.println(sayi);
            } else continue;
        }*/

        int adet = 5;
        int counter = 0;
        for (int i = 1; i <= adet; ) {
            counter++;
            int sayi = rastgeleSayiUret(10000, 90000);
            if (sayi % 2 == 0) {
                System.out.println(i + "---> " + sayi);
                i++;
            }
        }
        System.out.println("counter = " + counter);

        System.out.println();
        rastgeleAdetliSayiUret(10000,90000,10,true, 8);
    }
    }

