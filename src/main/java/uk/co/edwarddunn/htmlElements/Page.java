package uk.co.edwarddunn.htmlElements;

import java.util.ArrayList;
import java.util.List;

public class Page {
	
	private List<String> pageHtml;
	private String pageName;
	
	private String HTML_START_TAG = "<html>";
	private String HTML_END_TAG = "</html>";
	private String TITLE_START_TAG = "<title>";
	private String TITLE_END_TAG = "</title>";
	private String BODY_START_TAG = "<body>";
	private String BODY_END_TAG = "</body>";
	
	public Page() {	}
	
	public Page(String _pageName) {
		pageName = _pageName;
		pageHtml = new ArrayList<String>();
		
		// create initial page tags
		pageHtml.add(HTML_START_TAG);
		
		// add page name as title
		pageHtml.add(TITLE_START_TAG + pageName + TITLE_END_TAG);
		
		pageHtml.add(BODY_START_TAG);
	}
	
	public void addLink(String linkUrl, String linkName) {
		Link link = new Link();
		pageHtml.add(link.addLink(linkUrl, linkName));
	}
	
	public void addImage(String imagePath, String altText) {
		Image image = new Image();
		pageHtml.add(image.addImage(imagePath, altText));
	}
	
	public void addParagraph(String text) {
		Paragraph paragraph = new Paragraph();
		pageHtml.add(paragraph.addParagraph(text));
	}
	
	public void addHeader(String text) {
		Header header = new Header();
		pageHtml.add(header.addHeader(text));
	}
	
	public void addSubHeader(String text) {
		Header header = new Header();
		pageHtml.add(header.addSubHeader(text));
	}
	
	public void addOrderedList(String... items) {
		List<String> listArray = new ArrayList<String>();
		
		for(String item : items) {
			listArray.add(item);
		}
		
		Lists list = new Lists();
		pageHtml.add(list.addOrderedList(listArray));	
	}
	
	public void addUnorderedList(String... items) {
		List<String> listArray = new ArrayList<String>();
		
		for(String item : items) {
			listArray.add(item);
		}
		
		Lists list = new Lists();
		pageHtml.add(list.addUnorderedList(listArray));
	}
	
	private void completePageTags() {
		pageHtml.add(BODY_END_TAG);
		pageHtml.add(HTML_END_TAG);
	}
	
	public void printHtml() {
		// create end of page tags before printing
		completePageTags();
		
		for(String s : pageHtml) {
			System.out.println(s);
		}
	}
	

}
