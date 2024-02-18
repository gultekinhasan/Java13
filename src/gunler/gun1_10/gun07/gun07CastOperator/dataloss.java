package gunler.gun1_10.gun07.gun07CastOperator;

public class dataloss {
    public static void main(String[] args) {

                int i = -375;
                byte b;

                // byte range is between -128 .... 127
                // number value starts counting from scratch
                // i = 256 ==> b = 0 --- dataloss is 256
                b = (byte) i;
                System.out.println("int data tipi i deger = " + i + " , byte data tipi b deger = " + b);


                double d = 325.85;

                // decimal data loss
                // d = 325.85 ==> i2 = 325 --- data is 0.85
                int i2 = (int) d;
                System.out.println("i2 = " + i2);


                // range + decimal dataloss
                // d = 325.85 ==> b2 = 69 ---- 256 + 0.85
                byte b2 = (byte) d;
                System.out.println("b2 = " + b2);

            }
        }

