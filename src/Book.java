import java.util.Objects;

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

    @Override
    public String toString() {
        return "Книга: " + nameBook + ", " + yearPublication + ", автор: " + author;
    }
    @Override
    public boolean equals(Object other){
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return Objects.equals(nameBook,book.nameBook);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(nameBook,yearPublication,author);
    }
}
