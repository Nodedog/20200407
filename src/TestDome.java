import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class TestDome {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的姓名");
        String name = scanner.nextLine();
        System.out.println("输入你的身份:1.管理员 2.普通用户");
        int num = scanner.nextInt();
        if (num == 1){
            return new AdminUser(name);
        }else{
            return new NormalUser(name);
        }
    }


    public static void main(String[] args) {
        //1.准备书籍
        BookList bookList = new BookList();

        //2.登陆
        User user = login();//定义一个User类的 user去接受login返回的AdminUser或NormalUser


        while (true) {
            int choice = user.menu();
            //3.根据输入的数字，确定调用哪个方法
            user.dooperation(choice, bookList);
        }
    }
}
