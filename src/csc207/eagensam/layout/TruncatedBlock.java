package csc207.eagensam.layout;

/**
 * A class that truncates a given TextBlock to the specified width
 * Written by Kabir Jain
 */
public class TruncatedBlock implements TextBlock{
	
	// Fields
	TextBlock left;
	int width;
	
	// Constructors
	
	public TruncatedBlock (TextBlock left, int width) {
		this.left = left;
		this.width = width;
	}
	
	// Methods 
	
	public int width() {
		return this.width;
	}
	
	public String row(int i) throws Exception {
		
		String result = this.left.row(i);
		
		result = result.substring(0, width);
		return result;
	}
	
	public int height() {
		return this.left.height(); 
	}
}
