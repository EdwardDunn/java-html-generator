package uk.co.edwarddunn.htmlElements;

public class Paragraph {
	
	private String START_PARAGRAPGH_TAG = "<p>";
	private String END_PARAGRAPGH_TAG = "</p>";
	
	public Paragraph() { }
	
	public String addParagraph(String text) {
		String paragraph = "";
		paragraph+= START_PARAGRAPGH_TAG + text + END_PARAGRAPGH_TAG;
		return paragraph;
	}

}
