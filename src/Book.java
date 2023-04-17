import java.util.Objects;

public class Book {
    private String nameBook ;
    private Author author ;

    private int writingDateBook;

    public Book( String nameBook, Author nameAuthor,int writingDateBook) {
        this.nameBook = nameBook;
        this.author = nameAuthor;
        this.writingDateBook = writingDateBook;

    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;

    }

    public String getNameBook() {
        return this.nameBook;
    }


    public void setAuthor(Author nameAuthor) {
        this.author = nameAuthor;

    }

    public Author getAuthor() {
        return this.author;
    }


    public void setWritingDateBook(int dateBook) {
        this.writingDateBook = dateBook;

    }

    public int getWritingDateBook() {
        return this.writingDateBook;
    }

    public String tostring() {
        return this.nameBook + this.author + this.writingDateBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return writingDateBook == book.writingDateBook && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, writingDateBook);
    }

}
