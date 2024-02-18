package gunler.gun41_50.gun47_AccessModifiers.ZOO;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Kuş",3,"Sarı Kırmızı");

        System.out.println(animal);
        animal.move();
        animal.eat();
    }
}
