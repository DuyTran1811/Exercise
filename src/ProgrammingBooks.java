public class ProgrammingBooks extends Books {
    private String language;
    private String framework;

    public ProgrammingBooks() {
    }

    public ProgrammingBooks(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBooks(String bookCode, String name, float price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBooks " +
                "Ma Sach " + "Ten Sach " + getName()+ " " + "Gia Sach "
                + getPrice()+" " + getBookCode() + " language = '" +
                language + '\'' + ", framework = '" + framework + '\'' + getPrice() + '}';
    }
}
