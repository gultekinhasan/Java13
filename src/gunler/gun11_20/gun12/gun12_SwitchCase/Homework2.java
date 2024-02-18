package gunler.gun11_20.gun12.gun12_SwitchCase;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Bir TV uzaktan kumandasında olduğu gibi uzaktan kumandanın sayı tuşlarına(1-10) basıldığını varsayarak
        basılan tuşlara kayıtlı TV kanallarını switch case yapısını kullanarak ekrana yazdıran programı yazınız.
        1.Kanal TRT
        2.Kanal FOX
        ...
         gibi
        Programı test etmek ve çalıştırmak için Scanner Class'ını kullanarak veri girişi yapılabilir.
         */


        System.out.print("İzlemek İstediğiniz Kanalın Rakamına Basınız : ");
        int rakam = scanner.nextInt();
        String kanalAdi = "";

        switch (rakam) {
            case 1:
                kanalAdi = "NTV SPOR";
                break;
            case 2:
                kanalAdi = "TRT SPOR";
                break;
            case 3:
                kanalAdi = "TNT SPOR";
                break;
            case 4:
                kanalAdi = "NATİONAL GEOGRAPHİC";
                break;
            case 5:
                kanalAdi = "BBC 1";
                break;
            case 6:
                kanalAdi = "BBC 2";
                break;
            case 7:
                kanalAdi = "BBC 3";
                break;
            case 8:
                kanalAdi = "SKY NEWS";
                break;
            case 9:
                kanalAdi = "KANAL D";
                break;
            case 10:
                kanalAdi = "SHOW TV";
                break;
            default:
                System.out.println("GEÇERSİZ RAKAM GİRDİNİZ..");
        }

            if (rakam != 0){
                System.out.println(kanalAdi);
            }
    }
}
