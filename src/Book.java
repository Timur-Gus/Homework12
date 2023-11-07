public class Book {
    private int yearPublication;
    private String nameBook;
    private Author author;
    public Book(int yearPublication,String nameBook,Author author){
        this.author = author;
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
    }
    public int getYearPublication(){
        return yearPublication;
    }
    public String getNameBook(){
        return nameBook;
    }
    public Author getAuthor(){
        return author;
    }
    public void setYearPublication(int yearPublication){
        this.yearPublication = yearPublication;
    }
}
