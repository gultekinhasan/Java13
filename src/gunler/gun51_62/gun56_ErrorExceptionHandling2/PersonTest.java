package gunler.gun51_62.gun56_ErrorExceptionHandling2;

import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.AddressException;
import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.AgeException;
import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.NameException;

public class PersonTest {
    public static void main(String[] args) {
        Person person = null;
        try {
            person = new Person("Ahmet", 25, "Adres");
        } catch (NameException ne) { //catch (NameException | AgeException | AddressException e)
            System.out.println(ne);
        } catch (AgeException ae) {
            System.out.println(ae);
        } catch (AddressException adre) {
            System.out.println(adre);
        }

        System.out.println(person);

        person.setAge(67);
        person.setAddress("Yeni adres");

        try {
            person.setName("Metin");
        } catch (NameException e) {
            System.out.println("Hata oluştu :" + e);
        }
        System.out.println(person);



    }
}
