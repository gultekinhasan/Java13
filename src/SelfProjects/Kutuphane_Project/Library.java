package SelfProjects.Kutuphane_Project;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

     private String name;
     private String address;
     private static ArrayList<Book> books;

     static {
          books = new ArrayList<>();
          Book book1 = new Book("Yanlıs Cumhuriyet","Arastırma","Liberus","ISBN-1321365468");
          Book book2 = new Book("Cereyanlar","Arastırma","Iletisim Yayınları","ISBN-18974531");
          Book book3 = new Book("Dogunun Limanları","Roman","YKY","ISBN-654228897");

          Author author1 = new Author("Sevan Nisanyan");
          Author author2 = new Author("Tanil Bora");
          Author author3 = new Author("Amin Maalouf");

          book1.addAuthor(author1);
          book2.addAuthor(author2);
          book3.addAuthor(author3);
     }

     public Library (String name,String address){
          setName(name);
          setAddress(address);
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public static ArrayList<Book> getBooks() {
          return books;
     }

     public static void setBooks(ArrayList<Book> books) {
          Library.books = books;
     }

     public void addBooks(Book book){
          books.add(book);
     }

     public void addBooks(Book... books){
          this.books.addAll(Arrays.asList(books));
     }

     public void listBooks(){
          for (Book book:books){
               System.out.println("book = " + book);
          }
     }
     public void listAuthorsBooks(String name){
          System.out.println("Name of Author : " + name);
          System.out.println("------------------------------");
          System.out.println("Books :");
          for (Book book:books){
               for (Author author: book.getAuthors()){
                    if(author.getName().equalsIgnoreCase(name)){
                         System.out.println("   " + book.getInfo());
                    }
               }
          }
          System.out.println();
     }


     public String toString() {
          return "Library{" +
                  "name='" + name + '\'' +
                  ", address='" + address + '\'' +
                  ", books=" + books +
                  '}';
     }
}
