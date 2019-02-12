
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
		return this.width; //this.left.height
	}
}
