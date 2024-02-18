package gunler.gun41_50.gun49_FinalKeyword_VarMethodHiding.FinalKeyword;

public class FinalArrays {

    public static void main(String[] args) {

            int[] teams = new int[2];
            teams[0] = 0;
            teams[1] = 1;

            System.out.println(teams[0]);
            System.out.println(teams[1]);

            teams[0] = 20;
            teams[1] = 21;

            System.out.println(teams[0]);
            System.out.println(teams[1]);

            int[] teams2 = {30,31};

            teams = teams2;
            System.out.println(teams[0]);
            System.out.println(teams[1]);

            ////////////////
            System.out.println();

            final int[] teams3 = {40,41};
            System.out.println(teams3[0]);
            System.out.println(teams3[1]);

            teams3[0] = 50;
            teams3[1] = 51;
            System.out.println(teams3[0]);
            System.out.println(teams3[1]);

            System.out.println();

            teams3[0]=44;
            teams3[1]=45;
            System.out.println(teams3[0]);
            System.out.println(teams3[1]);

            System.out.println();

            int[] teams4 = {60,61};

            //teams3 = teams4;

            System.out.println(teams4[0]);
            System.out.println(teams4[1]);
            System.out.println(teams3[0]);
            System.out.println(teams3[1]);

        }
}
