
package com.hnof.library;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookAnalyzer5Test {
	
	private SimpleBookService simplebookservice;
	private BookAnalyzer bookanalyzer;

	 @BeforeEach
	void setup() {
		 simplebookservice = new SimpleBookService(true, 250, "CS101");
		 bookanalyzer = new BookAnalyzer(simplebookservice);
	}
	 //returns the classification of the book based on its ID 
	 @Test
	 void TestclassifyBook() {
		 String BookID="CS101";
        
		 String result = bookanalyzer.classifyBook(BookID);
		 
		 assertEquals("Computer Science", result);
	 }}