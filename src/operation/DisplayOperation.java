package operation;

import book.BookList;

public class DisplayOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍");
        for (int i = 0; i < bookList.getUsedsize(); i++) {
            System.out.println(bookList.getBooks(i));
        }
    }
}
