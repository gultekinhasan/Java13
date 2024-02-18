package gunler.gun31_40.gun31_Arrays;

public class ArrayLoop {
    public static void main(String[] args) {

        int [] myList = {15,23,76,45,89,32,90};
        System.out.println(myList[0]);
        System.out.println(myList[1]);
        System.out.println(myList[2]);
        System.out.println(myList[3]);
        System.out.println(myList[4]);
        System.out.println(myList[5]);
        System.out.println(myList[6]);

        System.out.println("-------------");

        for (int i=0;i<myList.length;i++){
            System.out.println(myList[i]);
        }

        System.out.println("--------------");

        for (int i=myList.length-1;i>=0;i--){
            System.out.println(myList[i]);
        }
    }
}
