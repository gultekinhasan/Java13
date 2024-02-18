package exercises.gun42_tekrar;

public class ReadOCTest {
    public static void main(String[] args) {
        ReadOnlyClass readOnlyClass = new ReadOnlyClass(34,"Istanbul");
        ReadOnlyClass readOnlyClass2 = new ReadOnlyClass(06,"Ankara");

        System.out.println("readOnlyClass2.getIllerV1() = " + readOnlyClass2.getIllerV1());
        System.out.println("readOnlyClass2.getIller() = " + readOnlyClass2.getIller());

        System.out.println("--------------------");

        System.out.println("readOnlyClass.getIller() = " + readOnlyClass.getIller());
        System.out.println("readOnlyClass.getIller() = " + readOnlyClass.getIller());

        System.out.println("----------------------------");

        System.out.println("readOnlyClass.getIllerV1() = " + readOnlyClass.getIllerV1());
        System.out.println("readOnlyClass2.getIllerV1() = " + readOnlyClass2.getIllerV1());
    }
}
