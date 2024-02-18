package exercises.gun15;

public class tekrar1 {
    public static void main(String[] args) {
        // Seklinde sayilari sekilli ciz
        //   1
        //   1 2
        //   1 2 3
        //   1 2 3 4
        //   1 2 3 4 5

        for (int i=1;i<=5;i++){
            System.out.println();
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println();


        for (int a=1;a<=5;a++){
            System.out.println();
            for (int b=1;b<=a;b++){
                System.out.print(a);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        for (int c=1;c<=7;c++){
            System.out.println();
            for (int d=1;d<=10;d++){
                System.out.print("* ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("---------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        for (int e=1;e<=5;e++){
            System.out.println();
            for (int f=1;f<=e;f++){
                System.out.print("* ");
            }
        }



    }
}
