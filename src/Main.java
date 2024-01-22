public class Main
{ public static void main ( String[] args ) {
    Author pushkin = new Author ("Александр", "Пушкин");
    Author turgenev = new Author ( "Иван","Тургенев" );
    Book fatharsAndSons = new Book ("Отцы и дети", 1861, turgenev);
    Book capitansDaughter = new Book ( "Капитанская дочка", 1836, pushkin );
    System.out.println (  capitansDaughter );
    System.out.println (  fatharsAndSons );


}
}