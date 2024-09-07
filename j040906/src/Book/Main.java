package Book;
import java.util.Scanner;

import User.librarian;
import User.ordinaryUsers;
import User.user;

public class Main {
    public static user logOn () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name=scanner.nextLine();
        System.out.println("请选择你的身份:1-->>图书管理员,2-->>普通用户");
        int ID=scanner.nextInt();
        if(ID==1){
            return new librarian(name);
        }
        else{
            return new ordinaryUsers(name);
        }
    }
    public static void main(String[] args) {
        bookList bookList = new bookList();
        user user = logOn();
        while (true) {
            int choice = user.menu();
            user.doWork(choice, bookList);
        }
    }
}
