package htmlElements;

public class Header {
	
	private String START_TAG = "<h1>";
	private String END_TAG = "</h1>";

	public Header() { }
	
	public String addHeader(String headerText) {
		String header = "";
		header+= START_TAG + headerText + END_TAG;
		return header;
	}
	
}
