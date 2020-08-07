package user;

import book.BookList;
import operation.IOperation;

abstract public class User {
    public String name;
    public IOperation[] Operations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void dooperation(int choice, BookList bookList){

        //operations[choice]拿到数组中对应的元素
        //再通过点号 调用对应的操作方法
        Operations[choice].work(bookList);
    }
}
