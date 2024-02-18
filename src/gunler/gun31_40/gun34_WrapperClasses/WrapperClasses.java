package gunler.gun31_40.gun34_WrapperClasses;
import com.sun.jdi.connect.Connector;
import gunler.gun1_10.gun08.gun08_Assignment_Relational_LogicalOperators.BasamaklaraAyirma;
import gunler.gun11_20.gun14.gun14_ForLoops.Faktoriyel;
import gunler.gun11_20.gun19.gun19_Methods1.SayHi;

import java.awt.geom.QuadCurve2D;
import java.lang.annotation.Inherited;
import java.nio.channels.ByteChannel;
public class WrapperClasses {
    public static void main(String[] args) {
        System.out.println("Wrapper classes in Java.");
        System.out.println("Primitive data types.");
        System.out.println("---------------------");

        boolean blBoolean = true;
        byte bytNumber = 12;
        short shrNumber = 12500;
        int intNumber = 123;
        long lngNumber = 111312124478678897L;
        float fltNumber = 123456.324255F;
        double dblNumber = 1251874617461462987298.568718726187368;
        char chrChar = 'A';

        System.out.println("blBoolean = " + blBoolean);
        System.out.println("bytNumber = " + bytNumber);
        System.out.println("intNumber = " + intNumber);
        System.out.println("lngNumber = " + lngNumber);
        System.out.println("fltNumber = " + fltNumber);
        System.out.println("dblNumber = " + dblNumber);
        System.out.println("chrChar = " + chrChar);
        System.out.println();

        System.out.println("Wrapper class data types.");
        System.out.println("-------------------------");

        //Wrapper classes
        //1-Constructor
        Boolean boolBooleanWrp = new Boolean(true);
        Boolean boolBooleanWrpStr = new Boolean("false");
        Byte bytWrp = new Byte((byte) 125);
        Byte bytWrpStr = new Byte("122");
        Short shrtWrp = new Short((short) 32134);
        Integer intNumberWrp = new Integer(12345); //primitive int parametre alan constructor
        Integer intNumberWrpStr = new Integer("3456"); //String parametre alan constructor
        Long lngNumberWrp = new Long(122345676786876L);
        Long lngNumberWrpStr = new Long("1223456767866765");
        Float fltNumberWrp = new Float(635376.76666F);
        Float fltNumberWrpStr = new Float("1223635376.6325666");
        Float fltNumberWrpDbl = new Float(12232312444144142635376.6325666); //double value alan constructor

        Character chrCharWrp = new Character('A');

        //2-.valueOf()
        Integer integerWrpVl = Integer.valueOf(1890);
        Integer integerWrpVlStr = Integer.valueOf("68797");
        Character chrCharWrpVl = Character.valueOf('B');
        Boolean boolBooleanWrpVl = Boolean.valueOf(false);
        Boolean boolBooleanWrpVlStr = Boolean.valueOf("false");

        //3- Assigning Literal value
        Integer integerLtr = 44556;
        Character chrCharWrpLtr = 'C';
        Boolean boolBooleanWrpLtr = true;

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " +(int) Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + (int )Character.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

        System.out.println("integerLtr      = " + integerLtr);
        System.out.println("integerWrpVlStr = " + integerWrpVlStr);
        Integer toplam = integerLtr + integerWrpVlStr;
        System.out.println("toplam          = " + toplam);

        System.out.println("System.identityHashCode(integerLtr) = " + System.identityHashCode(integerLtr));
        System.out.println("System.identityHashCode(fltNumberWrp) = " + System.identityHashCode(fltNumberWrp));
        System.out.println();

        Integer sayi1 = 12345;
        Integer sayi2 = 12345;

        System.out.println("(sayi1 == sayi2) = " + (sayi1 == sayi2));
        System.out.println("sayi1.equals(sayi2) = " + sayi1.equals(sayi2));

        //Integer cashing -128  ile 127 aralığındaki tam sayılar için == operatörü ile karşılaştırma yapılabilir.
        /*
        Integer number1 = -128;
        Integer number2 = -128;
        */
        Integer number1 = Integer.valueOf(-128);
        Integer number2 = Integer.valueOf (-128);

        System.out.println("System.identityHashCode(number1) = " + System.identityHashCode(number1));
        System.out.println("System.identityHashCode(number2) = " + System.identityHashCode(number2));
        System.out.println("(number1 == number2) = " + (number1 == number2));

        System.out.println("number1.doubleValue() = " + number1.doubleValue());
        System.out.println("number1.shortValue() = " + number1.shortValue());
        System.out.println("number1.byteValue() = " + number1.byteValue());
        System.out.println("number1.toString() = " + number1.toString());

    }
}
