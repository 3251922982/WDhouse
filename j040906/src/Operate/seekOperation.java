package Operate;
import Book.bookList;
import java.util.Scanner;

public class seekOperation implements  bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("---查找图书---");
        System.out.println("请输入你要查找的图书--》》");
        Scanner scanner=new Scanner(System.in);
        String BookName=scanner.nextLine();
        for(int i=0;i< bookList.getUseSize();i++){
            if(bookList.getBook(i).bookName.equals(BookName)){
                System.out.println("找到名为"+BookName+"的书");
                System.out.println(bookList.getBook(i));
                System.out.println();
                return;
            }
        }
        System.out.println("未找到这本书");
        System.out.println();
    }
}
