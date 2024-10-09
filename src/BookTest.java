

public class BookTest {

    public static void main(String[] args) {

        Book book1 = new Book("Exciting new recipes for people who want something quick an easy", 52);
        Book book2 = new Book("The big catalogue of all green animals ever existed", 55);


        System.out.println(Utilities.getFirstRepeatedCharacter("Hello"));
        System.out.println(Utilities.goDownToOne(5));

        System.out.println(Book.isRepeatingSummary("Exciting new recipes for people who want something quick an easy", 52));
        System.out.println(Book.isRepeatingSummary("The big catalogue of all green animals ever existed", 55));




    }

}
