
package com.hnof.library;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookAnalyzer4Test {
	
	private SimpleBookService simplebookservice;
	private BookAnalyzer bookanalyzer;

	 @BeforeEach
	void setup() {
		 simplebookservice = new SimpleBookService(true, 315 , "SE202");
		 bookanalyzer = new BookAnalyzer(simplebookservice);
	}
	 
	 @Test
	 void TestcalculateBookPrice() {
		 String BookID="SE202";
        
		 double result = bookanalyzer.calculateBookPrice(BookID);
		 
		 assertEquals(157.5, result);
	 }}