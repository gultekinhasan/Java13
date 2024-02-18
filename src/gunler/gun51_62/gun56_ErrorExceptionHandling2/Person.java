package gunler.gun51_62.gun56_ErrorExceptionHandling2;

import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.AddressException;
import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.AgeException;
import gunler.gun51_62.gun56_ErrorExceptionHandling2.Exceptions.NameException;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String address) throws NameException{
        setName(name);
        setAge(age);
        setAddress(address);
    }

    public String getName() {
        return name;
    }
    /**
     * Checked exception---> Exception class'ını veya sub classlarını miras alarak oluşturululan exception'lar
     * Checked exception olduğundan yani compiler tarafından denetlenen bir exception olduğundan
     * bu metodu çağıranlar handling mekanizması kurmak zorundadır. Aksi taktirde compiler kodu derlemeyecektir
     *
     * @param name --> String name
     * @throws NameException--> NameException throw eder.
     */
    public void setName(String name) throws NameException {
        if(name.isBlank() || name.length() < 3){
            throw new NameException("İsim alanı boş ve 3'ten küçük olamaz!!!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    /**
     * Bu method AgeException throw eder. AgeException RuntimeException class'ını miras aldığından
     * UnChecked exception'dır. Yani bu metodu çağıranların handling mekanızmasını oluşturup oluşturmadıklarını
     * compiler denetlemez.
     * @param age
     * @throws AgeException
     */
    public void setAge(int age) throws AgeException {
        if(age > 0 && age < 120){
            this.age = age;
        }else throw new AgeException("Yaş bilgisi 0'dan büyük 120'den küçük olmalıdır!!!");
    }

    public String getAddress() {
        return address;
    }

    /**
     * Bu method AddressException throw eder. AddressException RuntimeException class'ını miras aldığından
     * UnChecked exception'dır. Yani bu metodu çağıranların handling mekanızmasını oluşturup oluşturmadıklarını
     * compiler denetlemez.
     * @param address
     * @throws AddressException
     */
    public void setAddress(String address) throws AddressException {
        if(address.isBlank()){
            throw new AddressException("Adres alanı boş geçilemez!!!");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
