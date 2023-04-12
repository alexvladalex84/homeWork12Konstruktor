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

    public String toString() {
        return nameAuthor + " " + secondNameAuthor;
    }
}
