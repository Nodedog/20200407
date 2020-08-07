package book;

public class BookList {
    private Book[] books;
    private int usedsize;


    public BookList(){
        this.books = new Book[10];
        this.books[0] = new Book("西游记","吴承恩",10,"小说");
        this.books[0] = new Book("水浒传","罗贯中",20,"小说");
        this.books[0] = new Book("三国演义","施耐庵",30,"小说");
        this.usedsize = 3;
    }

    public int getUsedsize() {
        return usedsize;
    }

    public void setUsedsize(int usedsize) {
        this.usedsize = usedsize;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }
    public void setBooks(int pos,Book book){
        this.books[pos] = book;
    }

}
