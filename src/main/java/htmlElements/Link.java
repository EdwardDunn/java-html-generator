package htmlElements;

public class Link {
	
	private String START_TAG = "<a";
	private String END_TAG = "</a>";
	private String HREF_TAG = "<href =\"";
	private String HREF_END_TAG = "\">";
	
	public Link() { }
	
	public String getLinkElement(String linkUrl) {
		String link = "";
		link+= START_TAG + HREF_TAG + linkUrl + HREF_END_TAG + END_TAG;
		return link;
	}

}
