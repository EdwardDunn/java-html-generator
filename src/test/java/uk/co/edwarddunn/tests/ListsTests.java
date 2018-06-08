/*
 * Description: Test class used to test the Lists class with a range of different inputs.
 * @author Edward Dunn
 * @version 1.0 
 */

package uk.co.edwarddunn.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import uk.co.edwarddunn.htmlElements.Lists;

/**
 * @author Edward Dunn
 *
 */
public class ListsTests {

	// -------------------------Unordered List Tests-------------------------//

	@Test
	public void addUnorderedList_ValidItems_HTMLReturned() {
		// arrange
		String expectedResult = "<ul>\n" + "  <li>Test item 1</li>\n" + "  <li>Test item 2</li>\n"
				+ "  <li>Test item 3</li>\n" + "<ul>";

		String actualResult = "";

		List<String> items = new ArrayList<String>();
		items.add("Test item 1");
		items.add("Test item 2");
		items.add("Test item 3");

		// act
		Lists list = new Lists();
		actualResult = list.addUnorderedList(items);

		// assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void addUnorderedList_OneItem_HTMLReturned() {
		// arrange
		String expectedResult = "<ul>\n" + "  <li>Test item 1</li>\n" + "<ul>";

		String actualResult = "";

		List<String> items = new ArrayList<String>();
		items.add("Test item 1");

		// act
		Lists list = new Lists();
		actualResult = list.addUnorderedList(items);

		// assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void addUnorderedList_TenItems_HTMLReturned() {
		// arrange
		String expectedResult = "<ul>\n" + "  <li>Test item 1</li>\n" + "  <li>Test item 2</li>\n"
				+ "  <li>Test item 3</li>\n" + "  <li>Test item 4</li>\n" + "  <li>Test item 5</li>\n"
				+ "  <li>Test item 6</li>\n" + "  <li>Test item 7</li>\n" + "  <li>Test item 8</li>\n"
				+ "  <li>Test item 9</li>\n" + "  <li>Test item 10</li>\n" + "<ul>";
		String actualResult = "";
		List<String> items = new ArrayList<String>();
		items.add("Test item 1");
		items.add("Test item 2");
		items.add("Test item 3");
		items.add("Test item 4");
		items.add("Test item 5");
		items.add("Test item 6");
		items.add("Test item 7");
		items.add("Test item 8");
		items.add("Test item 9");
		items.add("Test item 10");

		// act
		Lists list = new Lists();
		actualResult = list.addUnorderedList(items);

		// assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void addUnorderedList_NoItems_HTMLReturned() {
		// arrange
		String expectedResult = "<ul>\n" + "<ul>";

		String actualResult = "";

		List<String> items = new ArrayList<String>();

		// act
		Lists list = new Lists();
		actualResult = list.addUnorderedList(items);

		// assert
		assertEquals(expectedResult, actualResult);
	}
	
	
	// -------------------------Ordered List Tests-------------------------//

	@Test
	public void addOrderedList_ValidItems_HTMLReturned() {
		// arrange
		String expectedResult = "<ol>\n" + "  <li>Test item 1</li>\n" + "  <li>Test item 2</li>\n"
				+ "  <li>Test item 3</li>\n" + "<ol>";

		String actualResult = "";

		List<String> items = new ArrayList<String>();
		items.add("Test item 1");
		items.add("Test item 2");
		items.add("Test item 3");

		// act
		Lists list = new Lists();
		actualResult = list.addOrderedList(items);

		// assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void addOrderedList_OneItem_HTMLReturned() {
		// arrange
		String expectedResult = "<ol>\n" + "  <li>Test item 1</li>\n" + "<ol>";

		String actualResult = "";

		List<String> items = new ArrayList<String>();
		items.add("Test item 1");

		// act
		Lists list = new Lists();
		actualResult = list.addOrderedList(items);

		// assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void addOrderedList_TenItems_HTMLReturned() {
		// arrange
		String expectedResult = "<ol>\n" + "  <li>Test item 1</li>\n" + "  <li>Test item 2</li>\n"
				+ "  <li>Test item 3</li>\n" + "  <li>Test item 4</li>\n" + "  <li>Test item 5</li>\n"
				+ "  <li>Test item 6</li>\n" + "  <li>Test item 7</li>\n" + "  <li>Test item 8</li>\n"
				+ "  <li>Test item 9</li>\n" + "  <li>Test item 10</li>\n" + "<ol>";
		String actualResult = "";
		List<String> items = new ArrayList<String>();
		items.add("Test item 1");
		items.add("Test item 2");
		items.add("Test item 3");
		items.add("Test item 4");
		items.add("Test item 5");
		items.add("Test item 6");
		items.add("Test item 7");
		items.add("Test item 8");
		items.add("Test item 9");
		items.add("Test item 10");

		// act
		Lists list = new Lists();
		actualResult = list.addOrderedList(items);

		// assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void addOrderedList_NoItems_HTMLReturned() {
		// arrange
		String expectedResult = "<ol>\n" + "<ol>";

		String actualResult = "";

		List<String> items = new ArrayList<String>();

		// act
		Lists list = new Lists();
		actualResult = list.addOrderedList(items);

		// assert
		assertEquals(expectedResult, actualResult);
	}
}
