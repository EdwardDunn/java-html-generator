package uk.co.edwarddunn.htmlElements;

public class Image {

	private String START_TAG = "<img src=\"";
	private String END_QOUTE = "\"";
	private String ALT_START_TAG = " alt=\"";
	private String END_TAG = ">"; 
	
	public Image() { }
	
	public String addImage(String imagePath, String altText) {
		String imageElement = "";
		imageElement+= START_TAG + imagePath + END_QOUTE + ALT_START_TAG + altText + END_QOUTE + END_TAG;
		return imageElement;
	}
	
}
