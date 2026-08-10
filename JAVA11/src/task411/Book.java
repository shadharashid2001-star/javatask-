package task411;

public class Book implements LibraryItem {

    private String title;
    private String author;
    private Integer pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()) {
            IO.println("Title cannot be empty");
        } else {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        if (pages >= 0) {
            this.pages = pages;
        } else {
            IO.println("Pages must be above 0");
            this.pages = 0;
        }
    }

    @Override
    public void printAllInfo() {
        IO.println("Book: " + title +
                " by " + author +
                " (" + pages + " pages) " +
                "[" + getShelfCode() + "]");
    }

    @Override
    public String getLabel() {
        return "Book";
    }

    @Override
    public String getShelfCode() {
        return "Shelf B-01";
    }
}