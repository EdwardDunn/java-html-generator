package htmlElements;

import java.util.ArrayList;
import java.util.List;

public class Page {
	
	private List<String> pageHtml;
	private String pageName;
	
	public Page() {	}
	
	public Page(String _pageName) {
		pageName = _pageName;
		pageHtml = new ArrayList<String>();
		
		// create initial page tags
		pageHtml.add("<html>");
		
		// add page name as title
		pageHtml.add("<title>" + pageName + "</title>");
		
		pageHtml.add("<body>");
	}
	
	public void addLink(String linkUrl) {
		Link link = new Link();
		
	}
	
	public void addImage(String imagePath) {
		Image image = new Image();
	}
	
	public void addParagraph(String text) {
		
	}
	
	public void addHeader(String text) {
		
	}
	
	public void addSubHeader(String text) {
		
	}
	
	private void completePageTags() {
		pageHtml.add("</body>");
		pageHtml.add("</html>");
	}
	
	public void printHtml() {
		// create end of page tags before printing
		completePageTags();
		
		for(String s : pageHtml) {
			System.out.println(s);
		}
	}
	

}
