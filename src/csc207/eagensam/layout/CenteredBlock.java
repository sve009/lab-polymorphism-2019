package csc207.eagensam.layout;

/**
 * A class that centers a given textblock in a given width
 * Written by Sam Eagen and Kabir Jain
 */

public class CenteredBlock implements TextBlock {
  //Fields----------------------------

  private TextBlock block;
  private int width;

  //Methods-----------------------------

  public CenteredBlock(TextBlock block, int width) throws Exception {
    if (block.width() > width) {
      System.out.println(this.block.width() + " " + width);
      throw new Exception("The width is smaller than the TextBlock width");
    }

    this.block = block;
    this.width = width;
  }//CenteredBlock(TextBlock, int)

  /*
   * Finds the number of spaces and pads them to the left and right
   */
  public String row(int i) throws Exception {
    int leftDisplacement = (this.width - this.block.width()) / 2;
    int rightDisplacement = this.width - this.block.width() - leftDisplacement;

    String returnRow = new String();

    for (int j = 0; j < leftDisplacement; j++) {
      returnRow += ' ';
    }

    returnRow += this.block.row(i);

    for (int j = 0; j < rightDisplacement; j++) {
      returnRow += ' ';
    }

    return returnRow;
  }//row(int i)

  public int width() {
    return this.width;
  }//width()

  public int height() {
    return this.block.height();
  }//height()
}//class CenteredBlock
