package uk.co.edwarddunn.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.edwarddunn.htmlElements.Header;

public class HeaderTests {

	@Test
	public void addHeader_ValidString_HTMLReturned() {
		// arrange
		String expectedResult = "";
		String actualResult = "";
		String headerText = "Test Header";
		
		// act
		Header header = new Header();
		expectedResult = header.addHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}

}
