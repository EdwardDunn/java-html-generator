/*
 * Description: Class used to return HTML for links when passed a URL and a link name.
 * @author Edward Dunn
 * @version 1.0 
 */

package uk.co.edwarddunn.htmlElements;

public class Link {
	
	/** The start tag. */
	private String START_TAG = "<a";
	
	/** The end tag. */
	private String END_TAG = "</a>";
	
	/** The href tag. */
	private String HREF_TAG = " href =\"";
	
	/** The href end tag. */
	private String HREF_END_TAG = "\">";
	
	/**
	 * Instantiates a new link.
	 */
	public Link() { }
	
	/**
	 * Adds the link.
	 *
	 * @param linkUrl the link url
	 * @param linkName the link name
	 * @return the string
	 */
	public String addLink(String linkUrl, String linkName) {
		String link = "";
		link+= START_TAG + HREF_TAG + linkUrl + HREF_END_TAG + linkName + END_TAG;
		return link;
	}

}
