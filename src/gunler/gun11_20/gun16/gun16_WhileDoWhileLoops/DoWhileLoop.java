package gunler.gun11_20.gun16.gun16_WhileDoWhileLoops;

public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("do while loop...");
        int counter = 0;

        do{
            //Tekrar edecek satırlar. En az bir kere mutlaka çalışır
            counter++;
            System.out.println("Counter : " + counter);
        }while (counter < 10);

        System.out.println();
        counter = 0;
        while (counter < 10){
            counter++;
            System.out.println("Counter : " + counter);
        }
    }
}
