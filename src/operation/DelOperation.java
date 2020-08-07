package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        System.out.println("请输入删除的书籍名称");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int cursize = bookList.getUsedsize();
            int i;
            int pos = 0;
            for ( i = 0; i < bookList.getUsedsize(); i++) {
               Book book = bookList.getBooks(i);
                if(book.getName().equals(name)) {
                    pos = i;
                    break;
                }
            }
            if (i == bookList.getUsedsize()){
                System.out.println("没有删除的这本书");
                return; 
            }
        for (int j = pos; j <cursize-1 ; j++) {
            Book book = bookList.getBooks(j+1);
            bookList.setBooks(j,book);
        }
        bookList.setUsedsize(cursize-1);
        System.out.println("删除书籍成功！");
    }

}
