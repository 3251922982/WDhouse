package User;

import Operate.*;

import java.util.Scanner;

public class ordinaryUsers extends user {
    public ordinaryUsers(String name) {
        super(name);
        super.array =new bookOperation[]{
                new seekOperation(),
                new borrowingOperation(),
                new displayOperation(),
                new returnOperation(),
                new exitOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("欢迎用户"+this.name+"登录图书馆,你可以操作：");
        System.out.println("-----------用户菜单---------------");
        System.out.println("         0. 查找图书         ");
        System.out.println("         1. 借阅图书         ");
        System.out.println("         2. 显示图书         ");
        System.out.println("         3. 归还图书         ");
        System.out.println("         4. 退出系统         ");
        System.out.println("--------------------------------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你的操作-->");
        int operate=scanner.nextInt();
        return operate;

    }
}
