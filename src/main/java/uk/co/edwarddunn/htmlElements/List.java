package uk.co.edwarddunn.htmlElements;

public class List {

	private String ORDERED_START_TAG = "<ul>";
	private String ORDERED_END_TAG = "<ul>";
	private String UNORDERED_START_TAG = "<ol>";
	private String UNORDERED_END_TAG = "<ol>";
	private String ITEM_START_TAG = "<li>";
	private String ITEM_END_TAG = "</li>";
	
	public List() { }
	
	public String addOrderedList(String... items) {
		String list = "";
		list+= ORDERED_START_TAG;
		
		for(String item : items) {
			list+= ITEM_START_TAG + item + ITEM_END_TAG;
		}
		
		list+= ORDERED_END_TAG;
		return list;		
	}
	
	public String addUnorderedList(String... items) {
		String list = "";
		list+= UNORDERED_START_TAG;
		
		for(String item : items) {
			list+= ITEM_START_TAG + item + ITEM_END_TAG;
		}
		
		list+= UNORDERED_END_TAG;
		return list;	
	}
	
}
