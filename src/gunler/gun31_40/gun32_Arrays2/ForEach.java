package gunler.gun31_40.gun32_Arrays2;

public class ForEach {
    public static void main(String[] args) {

        //for each loop

     /*   for (datatype elementVariable : array){
            elementVariable
        }  */

        int [] sayilar = new int[3];
        sayilar[0]=1;
        sayilar[1]=2;
        sayilar[2]=3;

        for (int sayi : sayilar){
            System.out.println("sayi = " + sayi);
        }

        System.out.println("----------------");

        double[] ondalikSayilar = new double[5];
        ondalikSayilar[0]=20.5;
        ondalikSayilar[1]=56.9;
        ondalikSayilar[2]=32.7;
        ondalikSayilar[3]=45.8;
        ondalikSayilar[4]=12.6;

        for (double ondalikSayi :ondalikSayilar ){
            System.out.println("ondalikSayi = " + ondalikSayi);
        }
    }
}
