package exercises.gun14;

public class tekrar1 {
    public static void main(String[] args) {
        // 1 ile 100 arasında 5 ile kalansız bölünen sayıları yazdırınız.
        for (int i=0;i<100;i++){
            if(i%5==0){
                System.out.println("i=" + i);
            }
        }
    }
}
