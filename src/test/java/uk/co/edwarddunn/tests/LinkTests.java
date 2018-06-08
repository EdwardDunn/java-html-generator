/**
 * 
 */
package uk.co.edwarddunn.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.edwarddunn.htmlElements.Link;

/**
 * @author Edward Dunn
 *
 */
public class LinkTests {

	@Test
	public void addLink_ValidURL_HTMLReturned() {
		// arrange
		String expectedResult = "<a href =\"https://testlink1.com\">Test Link 1</a>";
		String actualResult = "";
		String linkUrl = "https://testlink1.com";
		String linkName = "Test Link 1";
		
		// act 
		Link link = new Link();
		actualResult = link.addLink(linkUrl, linkName);
		
		// assert
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void addLink_EmptyURL_HTMLReturned() {
		// arrange
		String expectedResult = "<a href =\"\">Test Link 2</a>";
		String actualResult = "";
		String linkUrl = "";
		String linkName = "Test Link 2";
		
		// act 
		Link link = new Link();
		actualResult = link.addLink(linkUrl, linkName);
		
		// assert
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void addLink_EmptyURLAndLinkName_HTMLReturned() {
		// arrange
		String expectedResult = "<a href =\"\"></a>";
		String actualResult = "";
		String linkUrl = "";
		String linkName = "";
		
		// act 
		Link link = new Link();
		actualResult = link.addLink(linkUrl, linkName);
		
		// assert
		assertEquals(expectedResult, actualResult);	
	}
	
	@Test
	public void addLink_LongURL_HTMLReturned() {
		// arrange
		String expectedResult = "<a href =\"\">Test Link 3</a>";
		String actualResult = "";
		String linkUrl = "https://thisisaverylongurlfortestingpurposesonlythisisaverylongurlfortestingpurposesonly.com";
		String linkName = "Test Link 3";
		
		// act 
		Link link = new Link();
		actualResult = link.addLink(linkUrl, linkName);
		
		// assert
		assertEquals(expectedResult, actualResult);	
	}

}
