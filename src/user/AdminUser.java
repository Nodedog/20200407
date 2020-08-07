package user;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User {
    public AdminUser(String name) {
        super(name);

        //数组中存放的是AdminUser的操作
        this.Operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    public int menu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("hello！" + this.name + "欢迎来到图书管理系统");
        System.out.println("1.查找书籍");
        System.out.println("2.新增书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.打印书籍");
        System.out.println("0.退出系统");
        int chioe = scanner.nextInt();
        return chioe;

    }
}
