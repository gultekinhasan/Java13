package gunler.gun11_20.gun11.gun11ControlFlowStatement2;

public class NestedIfExample {
    public static void main(String[] args) {
        //bir kişinin yasına gore onun yetişkin ve ogrencı olup olmadığını nested ıf ile cek eden bir code yazınız.
        // age>=18 ise yetişkin
        //isStudent = true ise kişi öğrenci olsun.

        int age = 15;
        boolean isStudent = true;

        if (age >= 18) {
            System.out.println("kişi yetişkindir.");
            if (isStudent) {
                System.out.println("kişi aynı zamanda öğrencidir.");
            } else {

                System.out.println("Ancak kişi öğrenci değildir.");
            }
        } else {
            System.out.println("kişi yetişkin değil.");
            if (isStudent) {
                System.out.println("Kişi ögrencidir.");

            } else {
                System.out.println("kisi ogrenci de degildir.");
            }


        }
    }
}