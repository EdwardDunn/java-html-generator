/*
 * Description: Test class used to test the Header class with a range of different inputs.
 * @author Edward Dunn
 * @version 1.0 
 */

package uk.co.edwarddunn.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.edwarddunn.htmlElements.Header;

public class HeaderTests {
	
	//--------------------------Header Tests-----------------------------//

	@Test
	public void addHeader_ValidString_HTMLReturned() {
		// arrange
		String expectedResult = "<h1>Test Header</h1>";
		String actualResult = "";
		String headerText = "Test Header";
		
		// act
		Header header = new Header();
		actualResult = header.addHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void addHeader_ValidStringDigitsOnly_HTMLReturned() {
		// arrange
		String expectedResult = "<h1>12345</h1>";
		String actualResult = "";
		String headerText = "12345";
		
		// act
		Header header = new Header();
		actualResult = header.addHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void addHeader_EmptyString_HTMLReturned() {
		// arrange
		String expectedResult = "<h1></h1>";
		String actualResult = "";
		String headerText = "";
		
		// act
		Header header = new Header();
		actualResult = header.addHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void addHeader_SpecialCharacters_HTMLReturned() {
		// arrange
		String expectedResult = "<h1>#$%£$%&^</h1>";
		String actualResult = "";
		String headerText = "#$%£$%&^";
		
		// act
		Header header = new Header();
		actualResult = header.addHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	
	//--------------------------Sub Header Tests--------------------------//
	
	@Test
	public void addSubHeader_ValidString_HTMLReturned() {
		// arrange
		String expectedResult = "<h1>Test Sub Header</h1>";
		String actualResult = "";
		String headerText = "Test Sub Header";
		
		// act
		Header header = new Header();
		actualResult = header.addSubHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void addSubHeader_ValidStringDigitsOnly_HTMLReturned() {
		// arrange
		String expectedResult = "<h3>5689</h3>";
		String actualResult = "";
		String headerText = "5689";
		
		// act
		Header header = new Header();
		actualResult = header.addSubHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void addSubHeader_EmptyString_HTMLReturned() {
		// arrange
		String expectedResult = "<h3></h3>";
		String actualResult = "";
		String headerText = "";
		
		// act
		Header header = new Header();
		actualResult = header.addSubHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void addSubHeader_SpecialCharacters_HTMLReturned() {
		// arrange
		String expectedResult = "<h1>[)]($%^*+-#</h1>";
		String actualResult = "";
		String headerText = "[)]($%^*+-#";
		
		// act
		Header header = new Header();
		actualResult = header.addHeader(headerText);
		
		// assert
		assertEquals(expectedResult, actualResult);
	}

}
