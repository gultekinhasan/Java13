package gunler.gun31_40.gun32_Arrays2;

public class VarArgs {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        sum(arr);
        //sum(1,2,3,4);
        sum2(1, 2, 3, 4, 5, 6);
        sum2(arr);
        sum3(1,2,3,4,5,6);

        concatStr("Mercedes", "Opel", "Toyota", "Sahin");

        String[] strArray = {"Range Rover", "Audi", "Dogan", "Sahin"};

        concatStr(strArray);

    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        System.out.println("sum = " + sum);
    }

    public static void sum2(int... arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        System.out.println("sum = " + sum);
    }
    public static void sum3(int... arr) {
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }

    public static void concatStr(String... str){
        String str2 = "";
        for (String value : str){
            str2 += value;

        }
        System.out.println(str2);

    }

}
