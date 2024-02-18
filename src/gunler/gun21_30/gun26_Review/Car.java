package gunler.gun21_30.gun26_Review;

public class Car {
    //instance variables--->Örnek-->nesne değişkenleri
    //Data members---properties---attributes---fields---states
    String marka;
    String model;
    String engineType;
    static final int MAX_SPEED = 220; //final--sabit--değiştirilemez---static class'a ait bütün objeler için ortak

    //No-args Constructor method
    public Car(){
        System.out.println("Default/Parametresiz Constructor called.");

    }
    //Args Constructor method
    public Car(String markasi, String modeli, String  motorTipi){
        System.out.println("Parametreli constructor called.");
        marka = markasi;
        model = modeli;
        engineType = motorTipi;
    }

    //Methods-behavior
    public void drive(int speed){
        if(speed <= MAX_SPEED){
            System.out.println("Ben " + marka + " " + model + " marka/model arabayım.");
            System.out.println(speed + " km hızla hareket ediyorum...");
            System.out.println();
        }else System.out.println("En fazla " + MAX_SPEED + " km hızla gidebilirsin!!!");
    }
    public void stop(){
        System.out.println("Ben " + marka + " " + model + " marka/model arabayım.");
        System.out.println("...stop ettim.");
    }

    public void turn(String direction, int angle){
        System.out.println("Ben " + marka + " " + model + " marka/model arabayım.");
        if(direction.equals("left")){
            System.out.println(angle +" derece...sola dönüyorum.");
        }
        if(direction.equals("right")){
            System.out.println(angle + " derece...sağa dönüyorum.");
        }
    }
    public void showInfo(){
        System.out.println("Marka       : " + marka);
        System.out.println("Model       : " + model);
        System.out.println("Engine Type : " + engineType);
    }

    public String getMarkaModel(){
        return marka + "-" + model;
    }
}
