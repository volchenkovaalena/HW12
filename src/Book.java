import java.util.Stack;

public class Book {
    private String name;
    private int year;
    private Author author;

    public Book ( String name, int year, Author author ) {
        this.name = name;
        this.year = year;
        this.author = author;

    }
    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getYear () {
        return year;
    }

    public void setYear ( int year ) {
        this.year = year;
    }

    public Author getAuthor () {
        return author;
    }

    public void setAuthor ( Author author ) {
        this.author = author;
    }

    @Override
    public String toString () {
        return "Название книги " + this.name + " год публикации " + this.year + " автор " + this.author ;
    }
}


