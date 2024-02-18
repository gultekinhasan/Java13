package gunler.gun31_40.gun35_Review.Kutuphane;

public class Kitap {
    String name;
    String publisher;
    String type;
    int publishDate;

    Yazar[] authors = new Yazar[3];

    public Kitap() {
    }

    public Kitap(String name, String publisher, String type, int publishDate, Yazar[] authors) {
        this.name = name;
        this.publisher = publisher;
        this.type = type;
        this.publishDate = publishDate;
        this.authors = authors;
    }

    public void printInfo() {
        System.out.println("Name of the book is            : " + name);
        System.out.println("Type of the book is            : " + type);
        System.out.println("Date of publish of the book is : " + publishDate);
        System.out.println("Publisher of the book is       : " + publisher);
        System.out.println("Author/s of the book");
        System.out.println("--------------------");
        for (int i = 0; i < authors.length; i++) {
            if(authors[i] !=null){
                authors[i].printInfo();
            }
        }
        System.out.println("\n-----------------------------------------------------");
    }
}
