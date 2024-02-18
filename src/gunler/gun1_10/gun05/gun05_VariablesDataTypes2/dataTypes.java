package gunler.gun1_10.gun05.gun05_VariablesDataTypes2;

public class dataTypes {
    public static void main(String[] args) {
        /* Data Type   Size            Range
        _________   ________        _________________________________________________________________________________________________
        byte        1 byte          Integers in the range of −128 to + 127
        short       2 bytes         Integers in the range of −32,768 to +32,767
        int         4 bytes         Integers in the range of −2,147,483,648 to +2,147,483,647
        long        8 bytes         Integers in the range of −9,223,372,036,854,775,808 to +9,223,372,036,854,775,807
        float       4 bytes         Floating-point numbers in the range of ±3.4 × 10^−38 to ±3.4 × 10^38,with 7 digits of accuracy
        double      8 bytes         Floating-point numbers in the range of ±1.7 × 10^−308 to ±1.7 × 10^308,with 15 digits of accuracy
        boolean     1 bit           true or false
                */

                //byte min and max values
                System.out.println("byte data type min and max values : " + Byte.MIN_VALUE + " ," + Byte.MAX_VALUE);

                //short data type min and max value
                System.out.println("short data type min and max values : " + Short.MIN_VALUE + " ," + Short.MAX_VALUE);

                //int data type min and max value
                System.out.println("int data type min and max values : " + Integer.MIN_VALUE + " ," + Integer.MAX_VALUE);

                //long data type min and max value
                System.out.println("long data type min and max values : " + Long.MIN_VALUE + " ," + Long.MAX_VALUE);

                //float data type min and max value
                System.out.println("float data type min and max values : " + Float.MIN_VALUE + " ," + Float.MAX_VALUE);

                //double data type min and max value
                System.out.println("double data type min and max values : " + Double.MIN_VALUE + " ," + Double.MAX_VALUE);

                // 8 bit ---> 1 byte
                // byte --->        0    0   0   0   0   0   0   0
                //                128   64  32  16   8   4   2   1
                //                  0    0   0   0   0   1   1   1 ----> 4 + 2 + 1 = 7   10 luk sayı sistemine göre 7 sayısı

                // 32 bit -int
                //0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0  0  0  1  1  1

                //64 bit - long
                //0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1 --- 7
            }
    }

