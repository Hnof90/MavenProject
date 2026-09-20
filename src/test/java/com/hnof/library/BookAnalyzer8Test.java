package com.hnof.library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookAnalyzer8Test {
	
	private SimpleBookService simplebookservice;
	private BookAnalyzer bookanalyzer;

	 @BeforeEach
	void setup() {
		 simplebookservice = new SimpleBookService(true, 411 , "HR200");
		 bookanalyzer = new BookAnalyzer(simplebookservice);
	}
	 //returns the classification of the book based on its ID 
	 @Test
	 void TestclassifyBook() {
		 String BookID="HR200";
        
		 String result = bookanalyzer.classifyBook(BookID);
		 
		 assertEquals("Other", result);
	 }}