package Operate;

import Book.bookList;

public class addOperation implements bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("增加图书");
    }
}
