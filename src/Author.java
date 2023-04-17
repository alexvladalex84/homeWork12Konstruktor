import java.util.Objects;

public class Author {
    private String nameAuthor ;
    private String secondNameAuthor;
    public Author(String nameAuthor,String secondNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.secondNameAuthor = secondNameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
       this.nameAuthor = nameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public void setSecondNameAuthor(String secondNameAuthor) {
        this.secondNameAuthor = secondNameAuthor;
    }

    public String getSecondNameAuthor() {
        return this.secondNameAuthor;
    }

//    public String toString() {
//        return nameAuthor + " " + secondNameAuthor;
//    }

    @Override
    public String toString() {
        return "Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", secondNameAuthor='" + secondNameAuthor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(secondNameAuthor, author.secondNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, secondNameAuthor);
    }
}
