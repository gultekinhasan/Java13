package gunler.gun1_10.gun05.gun05_VariablesDataTypes2;

public class charDataType {
    public static void main(String[] args) {
        //Consist of 65535 sembols including printable and non printable chars
        System.out.println("Char data type...");
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        //---> 10'lık min = 0 , max = 65535    16 lık sayı sistemine göre min = '\u0000', max = '\uFFFF'
        char harf = 'A';
        harf = '\uFFFF';
        System.out.println("Harf = " + harf);

        int intHarf = 'ş'; // int code number of char 'ş'
        System.out.println("ş ---> " + intHarf);

        intHarf = harf;
        System.out.println("harf --->  " + intHarf);

        intHarf = intHarf + 2;
        System.out.println(intHarf);
        harf = (char) intHarf; // char equivalent of int number
        System.out.println("harf --->  " + harf);

        int derece = -10;
        harf = 9924;
        System.out.println("Bugün hava sıcaklığı " + derece + " derece ve çok soğuk " + harf);

        derece = 15;
        harf = 9925;
        System.out.println("Bugün hava sıcaklığı " + derece + " derece ve hava bulutlu " + harf);

        derece = 3;
        harf = 9928;
        System.out.println("Bugün hava sıcaklığı " + derece + " derece ve yağmurlu " + harf);
    }
}
