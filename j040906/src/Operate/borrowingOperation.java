package Operate;

import Book.bookList;

public class borrowingOperation implements bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("借阅图书");
    }
}
