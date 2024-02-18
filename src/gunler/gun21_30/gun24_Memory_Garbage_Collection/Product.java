package gunler.gun21_30.gun24_Memory_Garbage_Collection;

public class Product {
    //Properties, states, fields... data members
    //Instance/Object variables--> Heap
    String name; // ---> Heap
    double unitPrice;// ---> Heap

    //Behavior/function/method of object
    public double fiyatHesapla(int amount) {
        double fiyat = unitPrice * amount;
        return fiyat;
    }

    public static void main(String[] args) {
        //Stack          Heap
        Product product1 = new Product();
        //product1 heap memory de oluşan nesnenin referansının/adresini barındıran ve stack memory de oluşan bir değişken

        System.out.println(product1); //Prints the identity(address like) of object which is created in heap memory.

        product1.name = "Elma"; //Heap memory de bulunur.
        product1.unitPrice = 15; //Heap memory de bulunur
        int miktar = 3; //Local variable Stack memory de oluşur.

        double fiyat = product1.fiyatHesapla(miktar); //fiyat is local variable it is created in Stack
        System.out.println("product1.name = " + product1.name);
        System.out.println("product1.unitPrice = " + product1.unitPrice);
        System.out.println("miktar = " + miktar);
        System.out.println("fiyat = " + fiyat);
    }
}
