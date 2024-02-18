package SelfProjects.Kutuphane_Project;

public class Author {

    private static int id = 9000;

    private int authorNo ;

    private String name ;

    public Author (String name){
     id++;
     setAuthorNo(id);
     setName(name);
    }

    public int getAuthorNo() {
        return authorNo;
    }
    public void setAuthorNo(int authorNo) {
        this.authorNo = authorNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String toString (){
        return "Author's, name : " + name + " and no : " + authorNo + "\n" ;
    }
}
