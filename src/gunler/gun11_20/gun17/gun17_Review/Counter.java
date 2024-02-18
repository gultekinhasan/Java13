package gunler.gun11_20.gun17.gun17_Review;

public class Counter {
    public static void main(String[] args) {
        int counter = 0;
        for (int i=0;i<1000;i++){
            if (i%17==0){
                counter++;
            }
        }
        System.out.println("17'ye tam bölünen sayı adedi : " + counter);

    }
}
