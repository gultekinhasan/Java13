package gunler.gun1_10.gun09.gun09_Review;

public class calısma {
    public static void main(String[] args) {

        int x = 50;
        int y = --x + x++ + x-- + x++;
        // 49 + 49 +50 +49

        System.out.println("x = " + x); //50
        System.out.println("y = " + y); //197
    }
}
