package Operate;

import Book.bookList;

public class exitOperation implements  bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("退出系统");
    }
}
