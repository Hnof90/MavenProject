
package com.hnof.library;
public class SimpleBookService implements BookService {
private boolean bookAvailable;
private int pages;
private String bookId;

public SimpleBookService(boolean bookAvailable, int pages, String bookId) {
    this.bookAvailable = bookAvailable;
    this.pages = pages;
    this.bookId = bookId;
}

@Override
public boolean isBookAvailable(String bookId) {
    return bookAvailable;
}

@Override
public int getPages(String bookId) {
    return pages;
}

@Override
public String getBookId(String bookId) {
    return this.bookId;
}

public void setBookAvailable(boolean available) {
    this.bookAvailable = available;
}

public void setPages(int pages) {
    this.pages = pages;
}

public void setBookId(String bookId) {
    this.bookId = bookId;
}
}