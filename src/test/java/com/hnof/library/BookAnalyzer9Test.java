
package com.hnof.library;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookAnalyzer9Test {
	
	private SimpleBookService simplebookservice;
	private BookAnalyzer bookanalyzer;

	 @BeforeEach
	void setup() {
		 simplebookservice = new SimpleBookService(true, 250, "CS101");
		 bookanalyzer = new BookAnalyzer(simplebookservice);
	}
	 
	 @Test
	 void TestisLongBookTrue() {
		 String BookID="CS101";
        
		 boolean result= bookanalyzer.isLongBook(BookID);
		 
		 assertTrue(result);
	 }}