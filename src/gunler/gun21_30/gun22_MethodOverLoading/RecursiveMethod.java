package gunler.gun21_30.gun22_MethodOverLoading;

public class RecursiveMethod {
    public static void main(String[] args) {

        // Parametre olarak verilen bir sayinin 1 e kadar tum degerlerin dize halinde toplanmasi

        int result = recursive(10);
        System.out.println("result = " + result);

    }

    public static int recursive(int number){
        if(number==1){
            return 1;
        }
        return number + recursive(number - 1);
    }
}
