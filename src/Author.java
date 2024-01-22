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

    @Override
    public String toString () {
        return firstName + " " + surname;
    }
}
