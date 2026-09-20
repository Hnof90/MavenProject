
package com.hnof.library;
public interface BookService {
// Check if the book is available
boolean isBookAvailable(String bookId);

// Get the number of pages
int getPages(String bookId);

// Get the book ID
String getBookId(String bookId);
}