package gunler.gun41_50.gun41_Encapsulation_2;

public class WriteOnlyTest {
    public static void main(String[] args) {
        WriteOnlyClass writeOnlyClass = new WriteOnlyClass(12,56);

        writeOnlyClass.setValue1(23456);
        writeOnlyClass.setValue2(142535456);
    }
}
