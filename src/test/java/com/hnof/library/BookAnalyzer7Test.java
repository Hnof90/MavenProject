
package com.hnof.library;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookAnalyzer7Test {
	
	private SimpleBookService simplebookservice;
	private BookAnalyzer bookanalyzer;

	 @BeforeEach
	void setup() {
		 simplebookservice = new SimpleBookService(true, 400 , "CE100");
		 bookanalyzer = new BookAnalyzer(simplebookservice);
	}
	 //returns the classification of the book based on its ID 
	 @Test
	 void TestclassifyBook() {
		 String BookID="CE100";
        
		 String result = bookanalyzer.classifyBook(BookID);
		 
		 assertEquals("Computer Engineering", result);
	 }}