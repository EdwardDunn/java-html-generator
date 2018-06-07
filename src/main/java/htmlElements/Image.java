package htmlElements;

public class Image {

	private String START_TAG = "<img src=\"";
	private String END_QOUTE = "\"";
	private String ALT_START_TAG = " alt=\"";
	private String END_TAG = ">"; 
	
	public Image() { }
	
	public String addImage(String imagePath, String alt_text) {
		String imageElement = "";
		imageElement+= START_TAG + imagePath + END_QOUTE + ALT_START_TAG + alt_text + END_QOUTE + END_TAG;
		return imageElement;
	}
	
}
