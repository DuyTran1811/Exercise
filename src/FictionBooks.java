public class FictionBooks extends Books {
    private String category;

    public FictionBooks() {
    }

    public FictionBooks(String category) {
        this.category = category;
    }

    public FictionBooks(String bookCode, String name,
                        float price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook " + "Ma Sach"+getBookCode()+ " " + getName() + " Gia Sach " + getPrice() + "category='" + getPrice() + category + '\'' + '}';
    }
}
