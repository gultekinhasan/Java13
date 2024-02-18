package gunler.gun31_40.gun34_WrapperClasses;

//Kendimizin oluşturduğu bir veri tipi
public class MyWrapperInt {
    int value;
    final static int MAX_VALUE = 1000;
    final static int MIN_VALUE = 0;

    //Constructor
    public MyWrapperInt(int sayi) {
        if (sayi <= MAX_VALUE && sayi >= MIN_VALUE) {
            value = sayi;
        } else value = 0;
    }

    //Constructor
    public MyWrapperInt(String sayi) {
        int temp;
        temp = Integer.parseInt(sayi); //Convert string to int
        if (temp <= MAX_VALUE && temp >= MIN_VALUE) {
            value = temp;
        } else value = 0;
    }

    public static MyWrapperInt valueOf(int sayi) {
        return new MyWrapperInt(sayi); //Constructor Call
    }

    public static MyWrapperInt valueOf(String sayi) {
        return new MyWrapperInt(sayi);
    }

    public byte byteValue() {
        return (byte) value;
    }

    public double doubleValue() {
        return (double) value;
    }

    public short shortValue() {
        return (short) value;
    }

    public String stringValue() {
        return value + "";
    }

    public static void main(String[] args) {
        //  Integer intSy = new Integer(1234);
        MyWrapperInt myWrapperInt = new MyWrapperInt(12);
        System.out.println("myWrapperInt.value = " + myWrapperInt.value);

        MyWrapperInt myWrapperInt1 = MyWrapperInt.valueOf(356);
        System.out.println("myWrapperInt1.value = " + myWrapperInt1.value);

        System.out.println("MyWrapperInt.MIN_VALUE = " + MyWrapperInt.MIN_VALUE);
        System.out.println("MyWrapperInt.MAX_VALUE = " + MyWrapperInt.MAX_VALUE);

        MyWrapperInt myWrapperInt2 = new MyWrapperInt("980");

        System.out.println("myWrapperInt2.value = " + myWrapperInt2.value);

        MyWrapperInt myWrapperInt3 = MyWrapperInt.valueOf("876");
        System.out.println("myWrapperInt3 = " + myWrapperInt3.value);

        System.out.println("myWrapperInt1.doubleValue() = " + myWrapperInt1.doubleValue());
        System.out.println("myWrapperInt1.byteValue() = " + myWrapperInt1.byteValue());

        String str = myWrapperInt1.stringValue();
        System.out.println("str = " + str);
    }
}

