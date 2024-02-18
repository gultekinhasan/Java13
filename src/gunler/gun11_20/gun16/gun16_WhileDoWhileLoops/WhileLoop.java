package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;

public class WhileLoop {
    public static void main(String[] args) {
       /* System.out.println("Merhaba Java.");
        System.out.println("Merhaba Java.");
        System.out.println("Merhaba Java.");
        System.out.println("Merhaba Java.");
        System.out.println("Merhaba Java.");*/

        int count = 1;
        while (count <= 10){ //true
            System.out.println(count + ".Merhaba java(while).");
            count++;
        }
        System.out.println("Döngü bitti.");

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i + " Merhaba java(for)");
        }
        ////////
        System.out.println();
        int sayac = 1;
        for(; sayac <=10 ;){
            System.out.println(sayac + " Merhaba java(for)");
            sayac++;
        }
    }

}
