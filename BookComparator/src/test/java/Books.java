public class Books implements Comparable<Books>{

    private String bookTitle;
    private Integer pageNumber;
    private String author;
    private Integer publicationDate;

    public Books(String bookTitle, Integer pageNumber, String author, Integer publicationDate) {
        this.bookTitle = bookTitle;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Integer publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Books o) {
        return this.bookTitle.compareTo(o.bookTitle);
    }
}
