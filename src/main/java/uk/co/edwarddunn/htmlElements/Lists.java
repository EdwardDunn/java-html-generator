/*
 * Description: Class used to return HTML for ordered and unordered lists when pass items as list of strings.
 * @author Edward Dunn
 * @version 1.0 
 */

package uk.co.edwarddunn.htmlElements;

import java.util.List;

public class Lists {

	/** The ordered start tag. */
	private String ORDERED_START_TAG = "<ul>";
	
	/** The ordered end tag. */
	private String ORDERED_END_TAG = "<ul>";
	
	/** The unordered start tag. */
	private String UNORDERED_START_TAG = "<ol>";
	
	/** The unordered end tag. */
	private String UNORDERED_END_TAG = "</ol>";
	
	/** The item start tag. */
	private String ITEM_START_TAG = "<li>";
	
	/** The item end tag. */
	private String ITEM_END_TAG = "</li>";
	
	/** The indent. */
	private String INDENT = "  ";
	
	/**
	 * Instantiates a new lists.
	 */
	public Lists() { }
	
	/**
	 * Adds the ordered list.
	 *
	 * @param items the items
	 * @return the string
	 */
	public String addOrderedList(List<String> items) {
		String list = "";
		list+= ORDERED_START_TAG + "\n";
		
		for(String item : items) {
			list+= INDENT;
			list+= ITEM_START_TAG + item + ITEM_END_TAG;
			list+= "\n";
		}
		
		list+= ORDERED_END_TAG;
		return list;		
	}
	
	/**
	 * Adds the unordered list.
	 *
	 * @param items the items
	 * @return the string
	 */
	public String addUnorderedList(List<String> items) {
		String list = "";
		list+= UNORDERED_START_TAG + "\n";
		
		for(String item : items) {
			list+= INDENT;
			list+= ITEM_START_TAG + item + ITEM_END_TAG;
			list+= "\n";
		}
		
		list+= UNORDERED_END_TAG;
		return list;	
	}
	
}
