package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Dan Brown";
        book.type = "Detective";
        book.title = "The Da Vinci Code";
        book.price = 45.0;

        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.title);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Paulo Coelho";
        audioBook.title = "11 Minutes";
        audioBook.type = "Novel";
        audioBook.length = 120;
        audioBook.narrator = "Alexa";
        audioBook.price = 37.5;
        audioBook.listen();

        EBook eBook = new EBook();
        eBook.author = "Alan Smith";
        eBook.title = "Invisible Hand";
        eBook.type = "Science";
        eBook.price = 52.5;
        eBook.pages = 432;
        eBook.size = 120;
        eBook.readBook();

    }
}
