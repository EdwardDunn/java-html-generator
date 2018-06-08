/**
 * 
 */
package uk.co.edwarddunn.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.edwarddunn.htmlElements.Image;

/**
 * @author Edward Dunn
 *
 */

public class ImageTests {

	@Test
	public void addImage_ValidPath_HTMLReturned() {
		// arrange
		String expectedResult = "<img src=\"test-path-1.jpg\" alt=\"Test Image 1\">";
		String actualResult = "";
		String imagePath = "test-path-1.jpg";
		String altText = "Test Image 1";
		
		// act
		Image image = new Image();
		actualResult = image.addImage(imagePath, altText);
		
		// assert
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void addImage_EmptyPath_HTMLReturned() {
		// arrange
		String expectedResult = "<img src=\"\" alt=\"Test Image 2\">";
		String actualResult = "";
		String imagePath = "";
		String altText = "Test Image 2";
		
		// act
		Image image = new Image();
		actualResult = image.addImage(imagePath, altText);
		
		// assert
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void addImage_EmptyPathAndAltText_HTMLReturned() {
		// arrange
		String expectedResult = "<img src=\"\" alt=\"\">";
		String actualResult = "";
		String imagePath = "";
		String altText = "";
		
		// act
		Image image = new Image();
		actualResult = image.addImage(imagePath, altText);
		
		// assert
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void addImage_DigitsOnly_HTMLReturned() {
		// arrange
		String expectedResult = "<img src=\"12345.jpg\" alt=\"Test Image 3\">";
		String actualResult = "";
		String imagePath = "12345.jpg";
		String altText = "Test Image 3";
		
		// act
		Image image = new Image();
		actualResult = image.addImage(imagePath, altText);
		
		// assert
		assertEquals(expectedResult, actualResult);	
	}
	


}
