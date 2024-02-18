package gunler.gun51_62.gun55_ErrorExceptionHandling1.Error;

public class OutOfMemoryErrorHeap1 {
    public static void main(String[] args) {
        System.out.println("I declared a big size array of int.");
        int[] bigArray = new int[10];
        try {
            bigArray = new int[1_000_000_000];
        } catch (OutOfMemoryError e) {
            System.out.println("Hata oluştu : " + e.getMessage());
            bigArray = new int[900_000_000];
        }
        System.out.println("bigArray.length = " + bigArray.length);
        System.out.println("Program çalışmaya devam ediyor.");
    }
}
