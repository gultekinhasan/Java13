package SelfProjects.Kutuphane_Project;
import java.util.ArrayList;
import java.util.Arrays;
public class Book {

private static int id = 1000;
private int bookNumber;
private String title;
private String type;
private String publisher;
private String ISBN;
private ArrayList<Author> authors;

public Book (String title, String type, String publisher, String ISBN){
    id++;
    setBookNumber(id);
    setTitle(title);
    setType(type);
    setPublisher(publisher);
    setISBN(ISBN);
    authors = new ArrayList<>();
}

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author){
    authors.add(author);
    }

    //bu kisima bak
    public void addAuthor(Author... authors){
    this.authors.addAll(Arrays.asList(authors));
    }

    public String getInfo(){
    return getBookNumber() + "-" + getTitle() + " " + getType() +  " " + getPublisher() + " " + getISBN();
    }

    public String toString(){
    return " Book's, BookNumber : " + bookNumber +"\n" +
           " Title              : " + title +"\n"+
           " Type               : " + type +"\n"+
            "Publisher          : " + publisher +"\n"+
            "ISBN               : " + ISBN +"\n"+
            "Authors            : " + getAuthors()+"\n";
    }
}
