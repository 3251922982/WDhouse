package Operate;

import Book.bookList;

public class seekOperation implements  bookOperation{
    @Override
    public void work(bookList bookList) {
        System.out.println("查找图书");
    }
}
