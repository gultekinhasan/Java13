package gunler.gun11_20.gun15.gun15_NestedForLoops;

public class NestedForLoop1 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            System.out.println(" ");
            System.out.println("iç döngü : " + i);
            for (int j=1;j<=5;j++){
                System.out.println("dış döngü : " + j);
            }
        }
    }
}
