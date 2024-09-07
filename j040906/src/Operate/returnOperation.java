package Operate;

import Book.bookList;

public class returnOperation implements  bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("归还图书");
    }
}
