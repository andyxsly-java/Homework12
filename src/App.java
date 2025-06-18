public class App {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Агата", "Кристи");
        Author secondAuthor = new Author("Дарья", "Донцова");

        Book firstBook = new Book("Скрюченный домишко", firstAuthor, 1949);
        Book secondBook = new Book("Вынос дела", secondAuthor, 2004);

        printInformationBook(firstBook);
        printInformationBook(secondBook);

        secondBook.setPublicationYear(2005);
        System.out.println("После изменения года публикации:");
        printInformationBook(secondBook);
    }

        public static void printInformationBook (Book book){
            System.out.println("Книга: " + book.getTitle());
            System.out.println("Автор: " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
            System.out.println("Год публикации: " + book.getPublicationYear());
    }
}
