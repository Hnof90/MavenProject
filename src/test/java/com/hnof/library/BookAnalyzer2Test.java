package com.hnof.library;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookAnalyzer2Test {
	
	private SimpleBookService simplebookservice;
	private BookAnalyzer bookanalyzer;

	 @BeforeEach
	void setup() {
		 simplebookservice = new SimpleBookService(false, 315, "SE202");
		 bookanalyzer = new BookAnalyzer(simplebookservice);
	}
	 
	 @Test
	 void TestIsBookAvailableFalse() {
		 String BookID="SE202";
        
		 boolean result= bookanalyzer.isBookAvailable(BookID);
		 
		 assertFalse(result);
	 }}