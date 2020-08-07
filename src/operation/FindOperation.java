package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;


public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的图书：");
        String name = scanner.nextLine();


        for (int i = 0; i < bookList.getUsedsize(); i++) {
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)) {
                System.out.println(book);
                System.out.println("查找到了这本书！");
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}