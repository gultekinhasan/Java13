package gunler.gun41_50.gun43_StaticClassMembers_2.StaticImport;
import java.util.Scanner;

import static java.lang.Math.*;
//import static java.lang.Math.PI;
//import static java.lang.Math.sqrt;

public class StaticImport {

    public static void main(String[] args) {
        System.out.println(Math.PI      );
        System.out.println(Math.sqrt(64));

        System.out.println("----------" );
        // Static import ile bir class'da yer alan static member'lara
        // class ismi kullanmadan ulasma imkani veriyor.
        System.out.println(PI           );
        System.out.println(sqrt(64     ));

        Scanner sc = new Scanner(System.in);


    }

}
