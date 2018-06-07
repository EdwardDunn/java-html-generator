package uk.co.edwarddunn.htmlElements;

public class Header {
	
	private String H1_START_TAG = "<h1>";
	private String H1_END_TAG = "</h1>";
	private String H3_START_TAG = "<h3>";
	private String H3_END_TAG = "</h3>";

	public Header() { }
	
	public String addHeader(String headerText) {
		String header = "";
		header+= H1_START_TAG + headerText + H1_END_TAG;
		return header;
	}
	
	public String addSubHeader(String subHeaderText) {
		String subHeader = "";
		subHeader+= H3_START_TAG + subHeaderText + H3_END_TAG;
		return subHeader;
	}
	
}
