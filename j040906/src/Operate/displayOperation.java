package Operate;

import Book.bookList;

public class displayOperation implements bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("显示图书");
    }
}
