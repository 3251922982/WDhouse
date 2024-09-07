package User;
import Operate.*;

import java.util.Scanner;

public class librarian extends user {
    public librarian(String name) {
        super(name);
        array =new bookOperation[]{
                new seekOperation(),
                new addOperation(),
                new deleteOperation(),
                new displayOperation(),
                new returnOperation(),
        };
    }

    @Override
    public int menu() {
        System.out.println("欢迎管理员"+this.name+"登录图书管理系统,你可以操作：");
        System.out.println("-----------管理员菜单-------------");
        System.out.println("         0. 查找图书         ");
        System.out.println("         1. 增加图书         ");
        System.out.println("         2. 删除图书         ");
        System.out.println("         3. 显示图书         ");
        System.out.println("         4. 退出系统         ");
        System.out.println("--------------------------------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你的操作-->");
        int operate=scanner.nextInt();
        return operate;
    }
}
