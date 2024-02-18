package gunler.gun31_40.gun35_Review.Kutuphane;

public class Kutuphane {
    String name;
    String address;

    Kitap[] books = new Kitap[100];

    public Kutuphane() {
    }

    public Kutuphane(String name, String address, Kitap[] books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public int getNumberOfBooks() {
        int result = 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i] != null) result++;
        }
        return result;
    }

    public void findBookByName(String name){
        for (Kitap book : books){
            if(book != null && book.name.contains(name)){
                book.printInfo();
            }
        }
    }
    public void findBookByType(String type){
        for (Kitap book : books){
            if(book != null && book.type.contains(type)){
                book.printInfo();
            }
        }
    }
    public void printInfo() {
        System.out.println("Name of the Library is    : " + name);
        System.out.println("Address of the Library is : " + address);
        System.out.println("----------------------------------------------------");
        System.out.println("Capacity of books in the library is : " + books.length);
        System.out.println("Number of books in the library is   : " + getNumberOfBooks());
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                books[i].printInfo();
                System.out.println("-------------------------------------------");
            }
        }

    }
}
