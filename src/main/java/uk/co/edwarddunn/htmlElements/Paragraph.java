/*
 * Description: Class used to return HTML for paragraphs when given text as a string.
 * @author Edward Dunn
 * @version 1.0 
 */

package uk.co.edwarddunn.htmlElements;

public class Paragraph {
	
	/** The start paragrapgh tag. */
	private String START_PARAGRAPGH_TAG = "<p>";
	
	/** The end paragrapgh tag. */
	private String END_PARAGRAPGH_TAG = "</p>";
	
	/**
	 * Instantiates a new paragraph.
	 */
	public Paragraph() { }
	
	/**
	 * Adds the paragraph.
	 *
	 * @param text the text
	 * @return the string
	 */
	public String addParagraph(String text) {
		String paragraph = "";
		paragraph+= START_PARAGRAPGH_TAG + text + END_PARAGRAPGH_TAG;
		return paragraph;
	}

}
