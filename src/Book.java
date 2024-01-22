import java.util.Objects;
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


    public String toString () {
        return "Название книги " + this.name + " год публикации " + this.year + " автор " + this.author ;
    }

    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( !(o instanceof Book book) ) return false;
        return year == book.year && Objects.equals ( name, book.name ) && Objects.equals ( author, book.author );
    }

    public int hashCode () {
        return Objects.hash ( name, year, author );
    }
}


