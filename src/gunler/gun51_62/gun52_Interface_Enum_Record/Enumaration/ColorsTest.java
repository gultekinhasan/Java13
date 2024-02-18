package gunler.gun51_62.gun52_Interface_Enum_Record.Enumaration;
import java.util.Arrays;

public class ColorsTest {
    public static void main(String[] args) {
        Colors color;
        color = Colors.WHITE;

        System.out.println(color);

        Araba araba = new Araba(Brands.Ford,color);
        Araba araba1 = new Araba(Brands.Mercedes,Colors.BLUE);

        System.out.println(araba);
        System.out.println(araba1);

        for (Colors color1 : Colors.values()){
            System.out.println(color1 + " - " + color1.ordinal());
        }

        //.values() returns Array of enum type
        Colors[] renkler = Colors.values();
        System.out.println("Arrays.toString(renkler) = " + Arrays.toString(renkler));

        //.name() returns String value of enum type
        System.out.println("color.name() = " + color.name());

        //.ordinal() returns int value of enum type
        System.out.println("color.ordinal() = " + color.ordinal());

        //.name() returns String value of enum type
        System.out.println("color.toString() = " + color.toString());

        //.valueOf(String str) returns String value of enum type
        System.out.println("Colors.valueOf(\"BLUE\") = " + Colors.valueOf("BLUE"));
    }
}
