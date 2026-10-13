
package com.hnof.library;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SimpleBookService implements BookService {
    private static final Logger logger = 
LoggerFactory.getLogger(SimpleBookService.class);
private boolean bookAvailable;
private int pages;
private String bookId;

public SimpleBookService(boolean bookAvailable, int pages, String bookId) {
    logger.info("Initializing SimpleBookService with book ID: {}", bookId);
    this.bookAvailable = bookAvailable;
    this.pages = pages;
    this.bookId = bookId;
}

@Override
public boolean isBookAvailable(String bookId) {
    logger.info("Checking availability for book ID: {}", bookId);
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