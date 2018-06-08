/*
 * Description: Class used to return HTML for main(<h1>) or sub headers(<h3>) when passed standard text as a string.
 * @author Edward Dunn
 * @version 1.0 
 */

package uk.co.edwarddunn.htmlElements;

public class Header {
	
	/** The h1 start tag. */
	private String H1_START_TAG = "<h1>";
	
	/** The h1 end tag. */
	private String H1_END_TAG = "</h1>";
	
	/** The h3 start tag. */
	private String H3_START_TAG = "<h3>";
	
	/** The h3 end tag. */
	private String H3_END_TAG = "</h3>";

	/**
	 * Instantiates a new header.
	 */
	public Header() { }
	
	/**
	 * Adds the header.
	 *
	 * @param headerText the header text
	 * @return the string
	 */
	public String addHeader(String headerText) {
		String header = "";
		header+= H1_START_TAG + headerText + H1_END_TAG;
		return header;
	}
	
	/**
	 * Adds the sub header.
	 *
	 * @param subHeaderText the sub header text
	 * @return the string
	 */
	public String addSubHeader(String subHeaderText) {
		String subHeader = "";
		subHeader+= H3_START_TAG + subHeaderText + H3_END_TAG;
		return subHeader;
	}
	
}
