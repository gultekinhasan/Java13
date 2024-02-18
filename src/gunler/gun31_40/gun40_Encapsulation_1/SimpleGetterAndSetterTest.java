package gunler.gun31_40.gun40_Encapsulation_1;

public class SimpleGetterAndSetterTest {
    public static void main(String[] args) {
        SimpleGetterAndSetter obj = new SimpleGetterAndSetter();
        SimpleGetterAndSetter obj1 = new SimpleGetterAndSetter(-34278);

      /*
      obj.number = -1673571;
        System.out.println("obj.number = " + obj.number);

        System.out.println("obj1.number = " + obj1.number);
        obj1.number = -8176182;
        System.out.println("obj1.number = " + obj1.number);
        */
        System.out.println("obj1 = " + obj1);
        System.out.println("obj = " + obj);

        System.out.println("obj1.getNumber() = " + obj1.getNumber());
        System.out.println("obj.getNumber() = " + obj.getNumber());
        System.out.println();

        obj.setNumber(1234);
        System.out.println("obj = " + obj);

        obj.setNumber(764286);
        System.out.println("obj = " + obj);
        obj.numberDegerGuncelle(1234);
        System.out.println("obj = " + obj);

    }
}
