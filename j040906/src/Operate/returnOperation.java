package Operate;
import Book.bookList;
import java.util.Scanner;

public class returnOperation implements  bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("---归还图书---");
        System.out.println("请输入你要归还的图书--》》");
        Scanner scanner=new Scanner(System.in);
        String BookName=scanner.nextLine();
        for(int i=0;i< bookList.getUseSize();i++){
            if(bookList.getBook(i).bookName.equals(BookName) && bookList.getBook(i).state==true){
                System.out.println("成功归还到名为"+BookName+"的书");
                bookList.getBook(i).state=false;
                System.out.println(bookList.getBook(i));
                System.out.println();
                return;
            }
        }
        System.out.println("你并没有借这本书哦");
        System.out.println();

    }
}
