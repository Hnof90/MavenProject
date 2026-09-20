package com.hnof.library;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookAnalyzer6Test {
	
	private SimpleBookService simplebookservice;
	private BookAnalyzer bookanalyzer;

	 @BeforeEach
	void setup() {
		 simplebookservice = new SimpleBookService(true, 315 , "SE202");
		 bookanalyzer = new BookAnalyzer(simplebookservice);
	}
	 //returns the classification of the book based on its ID 
	 @Test
	 void TestclassifyBook() {
		 String BookID="SE202";
        
		 String result = bookanalyzer.classifyBook(BookID);
		 
		 assertEquals("Software Engineering", result);
	 }}