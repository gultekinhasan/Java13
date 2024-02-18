package gunler.gun31_40.gun35_Review;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Integer[] sayilar = new Integer[3];

        Object[] objects = new Object[5]; //This array can hold all Class type elements

        objects[0] = 1234;
        objects[1] = "Merhaba";
        objects[2] = new Person("Ahmet","Falanca","12345", "Adresi...");
        objects[3] = Double.valueOf(111.345);

        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Integer){ //dolaşırken rastladığımız eleman Integer class ı türünde ise
                System.out.println("Bu eleman Integer class ının bir elemanıdır.");
                System.out.println("Original value is      : " + objects[i]);
                System.out.println("Multiply by 2 is       :" + ((Integer) objects[i] * 2));
            }
            if (objects[i] instanceof String){ //dolaşırken rastladığımız eleman String class ı türünde ise
                System.out.println("Bu eleman String class ının bir elemanıdır.");
                System.out.println(((String) objects[i]).toUpperCase());
            }
            if (objects[i] instanceof Person){//dolaşırken rastladığımız eleman Person class ı türünde ise
                System.out.println("Bu eleman Person class ının bir elemanıdır.");
                ((Person) objects[i]).printInfo();
            }
            if(objects[i] instanceof Double){
                System.out.println("Bu eleman Double class ının bir elemanıdır.");
                System.out.println("Original value is      : " + objects[i]);
                System.out.println("Int value of double is : " + ((Double) objects[i]).intValue());
            }
        }
    }
}
