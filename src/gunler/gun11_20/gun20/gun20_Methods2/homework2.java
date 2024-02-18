package gunler.gun11_20.gun20.gun20_Methods2;

public class homework2 {
    public static void main(String[] args) {


    convert(28);
    }

    public static void convert (double km){
        // 1 mile = 1.609344 km
        double mile;
        mile = km * 0.621371192 ;

        System.out.println(km + " km is equal to = " + mile);
    }

}
