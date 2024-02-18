package gunler.gun41_50.gun47_AccessModifiers.ZOO;

public class ZooTest {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("AOÇ Hayvanat Bahçesi","Çamlıca mah. Demetevler/ANKARA");

        Dog dog = new Dog("Karabaş",5,"Beyaz");
        Dog dog1 = new Dog("Fino",2,"Siyah");
        Dog dog2 = new Dog("Johny",8,"Kahve");

        Bird bird1 = new Bird("Cici kuş",1,"Sarı-Kırımızı");
        Bird bird2 = new Bird("Paşa",3,"Sarı-Lacivert");
        Bird bird3 = new Bird("Maviş",1,"Mavi");

        zoo.addAnimal(dog);
        zoo.addAnimal(dog1,dog2,bird1,bird2,bird3);
        zoo.addAnimal(new Dog("Akbaş",10,"Beyaz"));

        System.out.println("zoo = " + zoo);

        //Animal ArrayList'ini dolaşırken parent class'ta olmayan child class'a özel bir metodu çalıştırmak
        //istersek dolaşırken rastladığımız objeyi sub-class türüne cast(dönüştürmemiz) gerekir.
        //Bunun için objenin hangi Class'ın instance olduğunu "instanceof" operatörünü kullanarak belirleyebiliriz
        for (Animal animal: zoo.getAnimals()){
            System.out.println("Name = " + animal.getName());
            animal.move();
           /* if(animal instanceof Bird){
                ((Bird) animal).fly(); //animal instance'ı Bird class'ının bir instance'ı ise animal objesini Bird Class'ına cast et (dönüştür)
            }*/
            if(animal instanceof Bird bird){ //Pattern matching-->Cast etmeden Bird Class'ı tğrğnde bir instance oluştur.
                bird.fly();
            }
        }
    }
}
