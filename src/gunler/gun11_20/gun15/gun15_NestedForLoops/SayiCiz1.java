package gunler.gun11_20.gun15.gun15_NestedForLoops;

public class SayiCiz1 {
    public static void main(String[] args) {
        // Seklinde sayilari sekilli ciz
        //   1
        //   1 2
        //   1 2 3
        //   1 2 3 4
        //   1 2 3 4 5

        for (int i=1 ; i<=5;i++){
            System.out.println();
            for (int j=1;j<=i;j++)
                System.out.print(" "+ j);
        }
    }
}
