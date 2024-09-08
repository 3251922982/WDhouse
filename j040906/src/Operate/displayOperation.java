package Operate;
import Book.bookList;

public class displayOperation implements bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("------显示图书-------");
        for(int i=0;i< bookList.getUseSize();i++){
                System.out.println(bookList.getBook(i));
        }
        System.out.println();
    }
}
