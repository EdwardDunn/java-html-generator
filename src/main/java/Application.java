import htmlElements.Page;

public class Application {

	public static void main(String args[]) {
		Page page = new Page("test page");
		page.addLink("https://google.com", "test link");
		page.addImage("test.jpg", "test image");
		page.printHtml();
	}
	
}
