public class Book {
    private String nameBook = new String() ;
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





}
