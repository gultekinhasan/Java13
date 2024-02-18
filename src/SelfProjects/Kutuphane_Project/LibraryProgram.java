package SelfProjects.Kutuphane_Project;

public class LibraryProgram {
    public static void main(String[] args) {

        Library library = new Library("Halk Kütüphanesi","Atatürk Caddesi no:1923");

        Book book  = new Book("asd","dfzxc","dfddf","cxvxc0");
        Book book1 = new Book("Yanlıs Cumhuriyet","Arastırma","Liberus","ISBN-1321365468");
        Book book2 = new Book("Cereyanlar","Arastırma","Iletisim Yayınları","ISBN-18974531");
        Book book3 = new Book("Dogunun Limanları","Roman","YKY","ISBN-654228897");
        Book book4 = new Book("Devlet ve Kuzgun","Araştırma","Iletişim Y.","6a+5fad65f");

        Author author = new Author("hasan");
        Author author1 = new Author("Sevan Nisanyan");
        Author author2 = new Author("Tanil Bora");

        Author author3 = new Author("Amin Maalouf");
        Author author5 = new Author("Vegas");
        Author author6 = new Author("Sükrü Abi");

        book.addAuthor(author,author5,author6);
        book1.addAuthor(author1);
        book2.addAuthor(author2);
        book3.addAuthor(author3);
        book4.addAuthor(author2);


        library.addBooks(book1,book,book2,book3,book4);


        System.out.println("author2.toString() = " + author.toString());
        System.out.println("author2.toString() = " + author1.toString());
        System.out.println("author2.toString() = " + author2.toString());
        System.out.println("author2.toString() = " + author3.toString());
        System.out.println("author2.toString() = " + author6.toString());
        System.out.println("author2.toString() = " + author5.toString());

        System.out.println("book3.getType() = " + book3.getType());
        book4.setPublisher("gebze");
        System.out.println(book4.getInfo());


        System.out.println("book1.toString() = " + book1.toString());
        System.out.println();

        library.listBooks();

        library.listAuthorsBooks("tanıl bora");


        System.out.println("library.toString() = " + library.toString());


    }
}
