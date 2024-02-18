package gunler.gun11_20.gun17.gun17_Review;
public class Bolen {
    public static void main(String[] args) {
        // Bir sayinin carpanlarini yazdiran bir dongu kurgulayin
        // 10 ==> 2 5 10

        int num = 24;
        String carpanlar = "";
        for(int i=1; i<=num; i++){
            if(num%i==0){
                carpanlar += i + " ";
            }
        }
        System.out.println("carpanlar = " + carpanlar);
    }
}
