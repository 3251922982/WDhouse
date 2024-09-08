package Operate;
import Book.bookList;
import java.util.Scanner;

public class borrowingOperation implements bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("---借阅图书---");
        System.out.println("请输入你要借阅的图书--》》");
        Scanner scanner=new Scanner(System.in);
        String BookName=scanner.nextLine();
        for(int i=0;i< bookList.getUseSize();i++){
            if(bookList.getBook(i).bookName.equals(BookName)){
                System.out.println("成功借到到名为"+BookName+"的书");
                bookList.getBook(i).state=true;
                System.out.println(bookList.getBook(i));
                System.out.println();
                return;
            }
        }
        System.out.println("查无此书");
        System.out.println();

    }
}
