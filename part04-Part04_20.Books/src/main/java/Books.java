public class Books {

    private String name;
    private int pages;
    private int year;

    public Books(String title, int numberOfPages, int releaseYear) {
        this.name = title;
        this.pages = numberOfPages;
        this.year = releaseYear;
    }

    public String getName() {
        return this.name;
    }

    public int getPages() {
        return this.pages;
    }

    public int getYear() {
        return this.year;
    }

    @Override

    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
