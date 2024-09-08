package Operate;
import Book.bookList;

public class exitOperation implements  bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("已退出系统");
        System.exit(0);

    }
}
