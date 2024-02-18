package gunler.gun31_40.gun32_Arrays2;

public class ArrayForEach {
    public static void main(String[] args) {

        String [] sehirler = {"Adana","Ankara","Bursa","Istanbul","Sakarya"};

        for (int i=0; i< sehirler.length;i++){
            System.out.println("Sehir : "+ sehirler[i]);
        }

        System.out.println("----------------");

        for (String sehir : sehirler){
            if (sehir.equals("Sakarya")){
                System.out.println("sehir = " + sehir.toUpperCase());
            }else System.out.println("sehir = " + sehir);
        }
    }
}
