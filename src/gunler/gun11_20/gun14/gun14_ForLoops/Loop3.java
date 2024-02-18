package gunler.gun11_20.gun14.gun14_ForLoops;

public class Loop3 {
    public static void main(String[] args) {

        //tum numeric data tipleri üzerinden başlangıc değişkeni atanabilir.
        for (long i=0;i<100;i++){
            System.out.println("i = " + i);
        }

        System.out.println("/////////////////////");

        // ancak ondalık degerler dongu ıcerısınde saydırılmaz, sadece tam sayılar saydırılır.
        for (double i=1.2;i<100.2;i+=0.5){
            System.out.println("i = " + i);
        }

        System.out.println("/////////////////////");
        // birden fazla condition değeri atanabilir.
        for (int i=3; i<7 && i>2;i++){
            System.out.println("i = " + i);
        }

        System.out.println("/////////////////////");
        // Başlangıç kısmını loop parantezinin dışından almak mümkündür.
        int i=0;
        for (;i<5;i++){
            System.out.println("i = " + i);
        }

        System.out.println("/////////////////////");
        // arttırma böyle de yapılabilir.
        for (int j=0;j<5;){
            System.out.println(" hello ");
            j++;
        }

        System.out.println("/////////////////////");
        // Bu şekilde
        for ( ; ; ){
            System.out.println(" World " );
        }


    }
}
