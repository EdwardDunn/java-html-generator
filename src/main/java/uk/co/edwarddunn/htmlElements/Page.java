/*
 * Description: Class used to interact with the different type of HTML elements available to the user.
 * This class also add the initial start and end tags for html, title and body.
 * @author Edward Dunn
 * @version 1.0 
 */

package uk.co.edwarddunn.htmlElements;

import java.util.ArrayList;
import java.util.List;

public class Page {
	
	/** The page html. */
	private List<String> pageHtml;
	
	/** The page name. */
	private String pageName;
	
	/** The html start tag. */
	private String HTML_START_TAG = "<html>";
	
	/** The html end tag. */
	private String HTML_END_TAG = "</html>";
	
	/** The title start tag. */
	private String TITLE_START_TAG = "<title>";
	
	/** The title end tag. */
	private String TITLE_END_TAG = "</title>";
	
	/** The body start tag. */
	private String BODY_START_TAG = "<body>";
	
	/** The body end tag. */
	private String BODY_END_TAG = "</body>";
	
	/**
	 * Instantiates a new page.
	 */
	public Page() {	}
	
	/**
	 * Instantiates a new page.
	 *
	 * @param _pageName the page name
	 */
	public Page(String _pageName) {
		pageName = _pageName;
		pageHtml = new ArrayList<String>();
		
		// create initial page tags
		pageHtml.add(HTML_START_TAG);
		
		// add page name as title
		pageHtml.add(TITLE_START_TAG + pageName + TITLE_END_TAG);
		
		pageHtml.add(BODY_START_TAG);
	}
	
	/**
	 * Adds the link.
	 *
	 * @param linkUrl the link url
	 * @param linkName the link name
	 */
	public void addLink(String linkUrl, String linkName) {
		Link link = new Link();
		pageHtml.add(link.addLink(linkUrl, linkName));
	}
	
	/**
	 * Adds the image.
	 *
	 * @param imagePath the image path
	 * @param altText the alt text
	 */
	public void addImage(String imagePath, String altText) {
		Image image = new Image();
		pageHtml.add(image.addImage(imagePath, altText));
	}
	
	/**
	 * Adds the paragraph.
	 *
	 * @param text the text
	 */
	public void addParagraph(String text) {
		Paragraph paragraph = new Paragraph();
		pageHtml.add(paragraph.addParagraph(text));
	}
	
	/**
	 * Adds the header.
	 *
	 * @param text the text
	 */
	public void addHeader(String text) {
		Header header = new Header();
		pageHtml.add(header.addHeader(text));
	}
	
	/**
	 * Adds the sub header.
	 *
	 * @param text the text
	 */
	public void addSubHeader(String text) {
		Header header = new Header();
		pageHtml.add(header.addSubHeader(text));
	}
	
	/**
	 * Adds the ordered list.
	 *
	 * @param items the items
	 */
	public void addOrderedList(String... items) {
		List<String> listArray = new ArrayList<String>();
		
		for(String item : items) {
			listArray.add(item);
		}
		
		Lists list = new Lists();
		pageHtml.add(list.addOrderedList(listArray));	
	}
	
	/**
	 * Adds the unordered list.
	 *
	 * @param items the items
	 */
	public void addUnorderedList(String... items) {
		List<String> listArray = new ArrayList<String>();
		
		for(String item : items) {
			listArray.add(item);
		}
		
		Lists list = new Lists();
		pageHtml.add(list.addUnorderedList(listArray));
	}
	
	/**
	 * Complete page tags.
	 */
	private void completePageTags() {
		pageHtml.add(BODY_END_TAG);
		pageHtml.add(HTML_END_TAG);
	}
	
	/**
	 * Prints the html.
	 */
	public void printHtml() {
		// create end of page tags before printing
		completePageTags();
		
		for(String s : pageHtml) {
			System.out.println(s);
		}
	}
	

}
