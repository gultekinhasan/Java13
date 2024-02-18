package exercises.Tekrar_01_12;

public class Personel {
    //Personel adında bir class oluşturalım   +
    //Kişinin adı, soyadı, email, dogum yılı bilgisi alınsın.Private olara tanımlansın   +
    //Email kontrolü yapılsın. Eğer içinde @ işareti yoksa “Geçersiz Mail” olarak kayıt yapılsın. +
    //getYas() adında bir metot olsun. Kullanıcının yaş bilgisini döndürsün. (2024’den çıkartarak)  +
    //Kaç kullanıcı eklendiği bilgisi alınabilsin.(static)
    //Ad ile Soyad bilgisi oluşturulan bir fonksiyonla alınabilsin.(ad ve soyadı birleştiren)



    public static int id=0;
    private int person;
    private String name;
    private String lastName;
    private String email;
    private int dateOfBirth;

    public Personel(String name,String lastName,String email,int dateOfBirth){
        id++;
        setPerson(id);
        setName(name);
        setLastName(lastName);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
    }



    public void setPerson(int person) {
        this.person = person;
    }
    public int getPerson() {
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        }else{
                System.out.println("invalid mail address");
        }
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge(){
        int age = (2024-dateOfBirth);
        return age;
    }


    @Override
    public String toString() {
        return "Personel{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
