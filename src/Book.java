import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book (String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear (int newYear) {
        this.publicationYear = newYear;
    }
    @Override
    public String toString() {
        return "Книга: \"" + title + "\", Автор: " + author + ", Год публикации: " + publicationYear;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return publicationYear == book.publicationYear
                && Objects.equals(title, book.title)
                && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, publicationYear);
    }
}
