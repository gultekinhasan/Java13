package gunler.gun11_20.gun17.gun17_Review;

public class CarpimTablosu {
    public static void main(String[] args) {

        // Carpim Tablosu olusturunuz 1 den 10 a kadar

        for(int i=1; i<=10; i++){

            if(i==6 || i==9 || i==10){
                System.out.println(i + "'lar");
            }else{
                System.out.println(i + "'ler");
            }

            for(int j=1; j<=10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
