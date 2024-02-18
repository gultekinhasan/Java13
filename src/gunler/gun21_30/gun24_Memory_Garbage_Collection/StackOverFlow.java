package gunler.gun21_30.gun24_Memory_Garbage_Collection;

public class StackOverFlow {
    /*public static void birMetod(){
        System.out.println("Deneme");
    }*/

    //Sonsuza kadar çalışacağından  stack memory'e belirli bir sayıda eklenmeden sonra stackoverflow hatası verir.
    //Stack hafızası artık yeni metod eklenmeye yetmeyecektir.
    public static void recursiveMethod(int sayi) {
        System.out.println("Sayı = " + sayi);
        recursiveMethod(sayi + 1);
    }

    public static void recursiveMethod2(int sayi, int count) {
        System.out.println("Sayı = " + sayi);

        //Recursive metodtan çıkmak için koşul
        if(sayi >= count){
            return;
        }
        recursiveMethod2(sayi + 1,count);
    }

    public static void main(String[] args) {
        /*for (int i = 0; i < 2000_000_000; i++) {
            birMetod(); //her seferinde metod işini bitireceğinden dolayı stack ten atılacak ve stackOverFlow hatası vermeyecektir.
        }*/
        //  recursiveMethod(1); //StackOverFlow hatası verir
        recursiveMethod2(1,100); //count parametresinin değerine göre stack alanına sığmayacak kadar metod çağrısı yapılırsa hata oluşabilir.
    }
}
