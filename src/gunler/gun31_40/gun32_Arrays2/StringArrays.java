package gunler.gun31_40.gun32_Arrays2;

public class StringArrays {

    public static void main(String[] args) {

        String[] cars = {"Toyota", "Opel", "Honda", "Volvo", " Mercedes "};

        System.out.println(cars[0].length()); // Toyota.length             //  6
        System.out.println(cars[1].charAt(2)); // Ope.charAt(2)            // e
        System.out.println(cars[4].trim().length()); // Mercedes.trim()    // "Mercedes"
        System.out.println(cars[2].substring(2, 3)); // Honda.substring()  //
        System.out.println(cars[3].equals(cars[4]));
        System.out.println(cars[3] == cars[4]);

        System.out.println("-----------------");

        // length vs length()
        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i].length());
        }

        // split()

        String str = "It will split the string to the arrays";

        String[] arr = str.split(" ");

        System.out.println("arr.length : " + arr.length);

        System.out.println(arr[3]);
        System.out.println(arr[5]);

        for(String word : arr){
            System.out.println("word = " + word);
        }

    }
}