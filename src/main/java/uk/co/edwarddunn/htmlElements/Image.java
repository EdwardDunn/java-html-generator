/*
 * Description: Class used to return HTML for image when passed an image path, alt text is also provided.
 * @author Edward Dunn
 * @version 1.0 
 */

package uk.co.edwarddunn.htmlElements;

public class Image {

	/** The start tag. */
	private String START_TAG = "<img src=\"";
	
	/** The end qoute. */
	private String END_QOUTE = "\"";
	
	/** The alt start tag. */
	private String ALT_START_TAG = " alt=\"";
	
	/** The end tag. */
	private String END_TAG = ">"; 
	
	/**
	 * Instantiates a new image.
	 */
	public Image() { }
	
	/**
	 * Adds the image.
	 *
	 * @param imagePath the image path
	 * @param altText the alt text
	 * @return the string
	 */
	public String addImage(String imagePath, String altText) {
		String imageElement = "";
		imageElement+= START_TAG + imagePath + END_QOUTE + ALT_START_TAG + altText + END_QOUTE + END_TAG;
		return imageElement;
	}
	
}
