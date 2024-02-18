package exercises.Tekrar_01_12;

public class PersonelTEst {
    public static void main(String[] args) {
        Personel p1 = new Personel("Hasan","Gultekin","av.gultekinhasan@gmail.com",1999);
        Personel p2 = new Personel("Sema","Zerlen","sema.zerlen@hotmail.com",1998);
        Personel p3 = new Personel("Ali","Yuzuak","av.aliyuzuak@gmail.com",1999);

//        System.out.println(p1.getAge());
//        System.out.println("p2.toString() = " + p2.toString());
//        System.out.println(Personel.id);
//        System.out.println("p3.getAge() = " + p3.getAge());
        System.out.println("p2.getAge() = " + p2.getAge());
        System.out.println(p2.toString());


    }
}
