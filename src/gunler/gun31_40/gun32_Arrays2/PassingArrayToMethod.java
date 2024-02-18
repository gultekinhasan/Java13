package gunler.gun31_40.gun32_Arrays2;

public class PassingArrayToMethod {

    public static void main(String[] args) {

        String[] cars = {"Toyota", "Opel", "Honda", "Volvo", "Mercedes"};
        String[] names = {"Joe", "Jahn", "Jane", "Jack", "George"};
        printArray(cars);
        System.out.println("--------------------------");
        printArray(names);
        System.out.println("--------------------------");
        int[] numbers = {12,54,75,68,79,23,57};
        printArray(numbers);

    }

    public static void printArray(String[] dizi){
        for(String eleman : dizi){
            System.out.println("eleman = " + eleman);
        }
    }

    public static void printArray(int[] dizi){
        for(int eleman : dizi){
            System.out.println("eleman = " + eleman);
        }
    }
}
