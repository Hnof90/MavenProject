package com.hnof.library;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookAnalyzer10Test {
	
	private SimpleBookService simplebookservice;
	private BookAnalyzer bookanalyzer;

	 @BeforeEach
	void setup() {
		 simplebookservice = new SimpleBookService(true, 150, "HR101");
		 bookanalyzer = new BookAnalyzer(simplebookservice);
	}
	 
	 @Test
	 void TestisLongBookFalse() {
		 String BookID="HR101";
        
		 boolean result= bookanalyzer.isLongBook(BookID);
		 
		 assertFalse(result);
	 }}