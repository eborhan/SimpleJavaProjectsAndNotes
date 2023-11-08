public class Books {
    private String title;
    private int pageNumber;
    private String author;
    private int pubDate;

    public Books(String title, int pageNumber, String author, int releaseDate) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.author = author;
        this.pubDate = releaseDate;
    }

    public String getBookTitle() {
        return title;
    }

    public void setBookTitle(String bookName) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int releaseDate) {
        this.pubDate = pubDate;
    }

}