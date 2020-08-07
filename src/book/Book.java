package book;

public class Book {
    private String name;
    private String auther;
    private int price;
    private String type;
    private boolean isborrowed;

    public Book(String name, String auther, int price, String type) {
        this.name = name;
        this.auther = auther;
        this.price = price;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsborrowed() {
        return isborrowed;
    }

    public void setIsborrowed(boolean isborrowed) {
        this.isborrowed = isborrowed;
    }

    @Override
    public String toString() {
        return ("Book{" +
                "name='" + name + '\'' +
                ", author='" + auther + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                //", isBorrowed=" + isBorrowed +
                (isIsborrowed() ? "已经被借出去" : "未被借出") +
                '}');
    }
}
