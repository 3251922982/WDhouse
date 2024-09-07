package Operate;

import Book.bookList;

public class deleteOperation implements bookOperation {
    @Override
    public void work(bookList bookList) {
        System.out.println("删除图书");
    }
}
