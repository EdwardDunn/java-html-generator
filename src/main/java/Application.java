import htmlElements.Page;

public class Application {

	public static void main(String args[]) {
		
		// example test
		Page page = new Page("Test Page");
		page.addHeader("Test Header");
		page.addLink("https://google.com", "test link");
		page.addImage("test.jpg", "test image");
		page.printHtml();
		
	}
	
}
