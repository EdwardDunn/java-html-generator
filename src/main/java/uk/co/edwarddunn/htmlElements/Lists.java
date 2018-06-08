package uk.co.edwarddunn.htmlElements;

import java.util.List;

public class Lists {

	private String ORDERED_START_TAG = "<ul>";
	private String ORDERED_END_TAG = "<ul>";
	private String UNORDERED_START_TAG = "<ol>";
	private String UNORDERED_END_TAG = "</ol>";
	private String ITEM_START_TAG = "<li>";
	private String ITEM_END_TAG = "</li>";
	private String INDENT = "  ";
	
	public Lists() { }
	
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
