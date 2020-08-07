package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements  IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要归还的图书：");
        String name = scanner.nextLine();

        for (int i = 0; i < bookList.getUsedsize(); i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)) {
                //说明有这本书
                book.setIsborrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
