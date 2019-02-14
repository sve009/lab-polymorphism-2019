package csc207.eagensam.layout;

/**
 * A small class that duplicates a TextBlock horizontally.
 * Everything does pretty much what's expected
 * Written by Sam Eagen
 */

public class BlockPair implements TextBlock {
  private TextBlock block;

  public BlockPair(TextBlock block) {
    this.block = block;
  }//BlockPair(TextBlock block)

  public String row(int i) throws Exception {
    String returnRow = this.block.row(i) + this.block.row(i);

    return returnRow;
  }//row(int i)

  public int width() {
    return 2 * this.block.width();
  }//width()

  public int height() {
    return this.block.height();
  }//height()
} //class BlockPair
