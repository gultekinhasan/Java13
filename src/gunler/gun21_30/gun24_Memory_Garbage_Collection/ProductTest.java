package gunler.gun21_30.gun24_Memory_Garbage_Collection;

public class ProductTest {
    public static void main(String[] args) {
        Product urun1 = new Product();
        Product urun2 = new Product();
        Product urun3 = new Product();
        //urun1,urun2,urun3 heap memory de oluşan nesnenin referansının/adresini barındıran ve stack memory de oluşan değişkenler
        urun1.name = "Elma"; //Heap memory de bulunur
        urun1.unitPrice = 15; //Heap memory de bulunur

        urun2.name = "Elma"; //Heap memory de bulunur
        urun2.unitPrice = 15; //Heap memory de bulunur

        urun3.name = "Armut"; //Heap memory de bulunur
        urun3.unitPrice = 25; //Heap memory de bulunur

        System.out.println("urun1 = " + urun1); //Prints the identity(address like) of object which is created in heap memory.
        System.out.println("urun2 = " + urun2); //Prints the identity(address like) of object which is created in heap memory.
        System.out.println("urun3 = " + urun3); //Prints the identity(address like) of object which is created in heap memory.

        System.out.println("urun1.name = " + urun1.name);
        System.out.println("urun3.name = " + urun3.name);
        System.out.println();

        urun1 = urun3; //urun1 is now referencing urun3. Stack memory de urun1'in referans ettiği daha önceki nesne referanssız kaldı.Artık erişilemez

        System.out.println("urun1.name = " + urun1.name);
        System.out.println("urun3.name = " + urun3.name);
        System.out.println("urun1 = " + urun1);
        System.out.println("urun2 = " + urun2);
        System.out.println("urun3 = " + urun3);

    }

}
