package gunler.gun41_50.gun41_Encapsulation_2;

public class ReadOnlyClassTest {
    public static void main(String[] args) {
        ReadOnlyClass sehir1 = new ReadOnlyClass(34, "Istanbul");
        ReadOnlyClass sehir2 = new ReadOnlyClass(6, "Ankara");

        System.out.println("sehir2.getIller() = " + sehir2.getIller());


    }
}
