package csc207.eagensam.layout;

/**
 * A class that creates a grid of an ascii character
 * Written by Kabir Jain
 * Slightly modified by Sam Eagen
 */
public class Grid implements TextBlock {
	
	// Fields
	
	int width;
	int height;
	char ch;
	
	// Constructors
	
	public Grid (int width, int height, char ch) {	
		this.width = width;
		this.height = height;
		this.ch = ch;		
	} // Grid (width, height, ch)

	// Methods
	
	public String row(int i) {
		// Basic info
		int h = height; //these two seem unnecessary, just use this.height and this.width
		int w = width;
		String chars = new String("");
		
		if(i < h) {		
			
			while (chars.length() < w) {
				
				chars += ch; //I would use String.add();
			}// while
		}// if
		
		return chars;
	}
	
	public int height() {
		return this.height;
	}
	
	public int width() {
		return this.width;
	}
	
}
