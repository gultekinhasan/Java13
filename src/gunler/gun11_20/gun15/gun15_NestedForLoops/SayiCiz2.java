package gunler.gun11_20.gun15.gun15_NestedForLoops;

public class SayiCiz2 {
    public static void main(String[] args) {
        // Seklinde sayilari sekilli ciz
        //   1
        //   2 2
        //   3 3 3
        //   4 4 4 4
        //   5 5 5 5 5

        for (int i=1 ; i<=5;i++){
            System.out.println();
            for (int j=1;j<=i;j++)
                System.out.print(" "+ i);
        }
    }
}
