import uk.co.edwarddunn.htmlElements.Page;

public class Application {

	public static void main(String args[]) {
		
		// example usage
		Page page = new Page("Test Page");
		page.addHeader("Main Header");
		page.addSubHeader("Sub Header");
		page.addLink("https://google.com", "test link");
		page.addImage("test.jpg", "test image");
		page.addParagraph("This application provides quick implementation of HTML pages.");
		page.addOrderedList("item1", "item2", "item3");
		page.addUnorderedList("item1", "item2", "item3");
		page.printHtml();
		
	}
	
}
