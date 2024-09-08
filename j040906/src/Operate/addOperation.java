package Operate;
import Book.book;
import Book.bookList;
import java.util.Scanner;

public class addOperation implements bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("-----增加图书------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("书名：");
        String BookName=scanner.nextLine();
        for(int i=0;i< bookList.getUseSize();i++){
            if(bookList.getBook(i).bookName.equals(BookName)){
                System.out.println("名为"+BookName+"的书已经存在了");
                System.out.println(bookList.getBook(i));
                System.out.println();
                return;
            }
        }
        System.out.println("作者：");
        String author=scanner.nextLine();
        System.out.println("价格：");
        int price=scanner.nextInt();
        //Scanner scanner1=new Scanner(System.in);
        scanner.nextLine();
        System.out.println("类型：");
        String type=scanner.nextLine();
        int useSize=bookList.getUseSize();
        book book=new book(BookName,author,price,type);
        bookList.setBooks(useSize, bookList.getBooks(),book);
        bookList.setUseSize(useSize+1);
        System.out.println("《"+BookName+"》"+"新增成功");
        System.out.println();
    }
}
