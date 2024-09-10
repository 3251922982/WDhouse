package Operate;
import Book.bookList;
import java.util.Scanner;

public class deleteOperation implements bookOperation {
    @Override
    public void work(bookList bookList) {
        System.out.println("---删除图书---");
        System.out.println("请输入你要删除的图书--》》");
        Scanner scanner=new Scanner(System.in);
        String BookName=scanner.nextLine();
        for(int i=0;i< bookList.getUseSize();i++){
            if(bookList.getBook(i).bookName.equals(BookName)){
                System.out.println("已删除名为"+BookName+"的书");
                System.out.println();
                bookList.getBook(i).bookName="暂空";
                bookList.getBook(i).author=null;
                bookList.getBook(i).price=0;
                bookList.getBook(i).type=null;
                bookList.getBook(i).state=false;
                return;
            }
        }
        System.out.println("这本书不存在，不可删除");
        System.out.println();
    }
}
