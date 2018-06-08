/**
 * 
 */
package uk.co.edwarddunn.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.co.edwarddunn.htmlElements.Paragraph;

/**
 * @author Edward Dunn
 *
 */
public class ParagraphTests {

	@Test
	public void addParagraph_ValidText_HTMLReturned() {
		// arrange
		String expectedResult = "<p>Test text 1, This application provides quick implementation of HTML pages.</p>";
		String actualResult = "";
		String text = "Test text 1, This application provides quick implementation of HTML pages.";

		// act
		Paragraph paragraph = new Paragraph();
		actualResult = paragraph.addParagraph(text);

		// assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void addParagraph_EmptyText_HTMLReturned() {
		// arrange
		String expectedResult = "<p></p>";
		String actualResult = "";
		String text = "";

		// act
		Paragraph paragraph = new Paragraph();
		actualResult = paragraph.addParagraph(text);

		// assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void addParagraph_LargeText_HTMLReturned() {
		// arrange
		String expectedResult = "<p>Test text 2, Lorem Ipsum is simply dummy text "
				+ "of the printing and typesetting industry. Lorem Ipsum has been "
				+ "the industry's standard dummy text ever since the 1500s, when "
				+ "an unknown printer took a galley of type and scrambled it to "
				+ "make a type specimen book. It has survived not only five "
				+ "centuries, but also the leap into electronic typesetting, r"
				+ "emaining essentially unchanged. It was popularised in the 1960s "
				+ "with the release of Letraset sheets containing Lorem Ipsum "
				+ "passages, and more recently with desktop publishing software "
				+ "like Aldus PageMaker including versions of Lorem Ipsum.</p>";
		
		String actualResult = "";
		
		String text = "Test text 2, Lorem Ipsum is simply dummy text of the printing "
				+ "and typesetting industry. Lorem Ipsum has been the industry's "
				+ "standard dummy text ever since the 1500s, when an unknown printer "
				+ "took a galley of type and scrambled it to make a type specimen book. "
				+ "It has survived not only five centuries, but also the leap into "
				+ "electronic typesetting, remaining essentially unchanged. It was "
				+ "popularised in the 1960s with the release of Letraset sheets "
				+ "containing Lorem Ipsum passages, and more recently with desktop "
				+ "publishing software like Aldus PageMaker including versions of "
				+ "Lorem Ipsum.";

		// act
		Paragraph paragraph = new Paragraph();
		actualResult = paragraph.addParagraph(text);

		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void addParagraph_DigitsOnly_HTMLReturned() {
		// arrange
		String expectedResult = "<p>Test text 3, 56516516516515616515616</p>";
		String actualResult = "";
		String text = "Test text 3, 56516516516515616515616";

		// act
		Paragraph paragraph = new Paragraph();
		actualResult = paragraph.addParagraph(text);

		// assert
		assertEquals(expectedResult, actualResult);
	}
	
}
