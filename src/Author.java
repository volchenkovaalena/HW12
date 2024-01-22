import java.util.Objects;

public class Author {
    private String firstName;
    private String surname;

    public Author (String firstName, String surname){
        this.firstName = firstName;
        this.surname = surname;
    }


    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public void setSurname ( String surname ) {
        this.surname = surname;
    }

    public String getSurname () {
        return surname;
    }

    public String toString () {
        return firstName + " " + surname;
    }


    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( !(o instanceof Author author) ) return false;
        return Objects.equals ( firstName, author.firstName ) && Objects.equals ( surname, author.surname );
    }

    public int hashCode () {
        return Objects.hash ( firstName, surname );
    }
}

