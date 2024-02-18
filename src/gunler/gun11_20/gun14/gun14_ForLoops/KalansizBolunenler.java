package gunler.gun11_20.gun14.gun14_ForLoops;
public class KalansizBolunenler {
    public static void main(String[] args) {
        // 1 ile 100 arasında 5 ile kalansız bölünen sayıları yazdırınız.

        for (int i=1;i<=100;i++){
            if (i%5==0){
                System.out.println("i = " + i);
            }
        }
        // 2.yol
        for (int i=5;i<=100; i+=5){
            System.out.println("i = " + i);
        }

    }

}
