package com.hnof.library;

public class BookAnalyzer {
private BookService bookService;

public BookAnalyzer(BookService bookService) {
    this.bookService = bookService;
}

// Original method
public boolean isBookAvailable(String bookId) {

    return bookService.isBookAvailable(bookId);
}

// 1. Calculate the price based on the number of pages
public double calculateBookPrice(String bookId) {

    int pages = bookService.getPages(bookId);

    return pages * 0.5;
}

// 2. Classify the book based on its ID
public String classifyBook(String bookId) {

    String id = bookService.getBookId(bookId);

    if (id.startsWith("CS")) {
        return "Computer Science";
    } 
    else if (id.startsWith("SE")) {
        return "Software Engineering";
    } 
    else if (id.startsWith("CE")) {
        return "Computer engineering";
    } 
    else {
        return "Other";
    }
}

// 3. Check if the book is a long book
public boolean isLongBook(String bookId) {

    int pages = bookService.getPages(bookId);

    return pages >= 200;
}
}