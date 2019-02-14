package com.mcfarevee.tests;

import java.io.PrintWriter;
import csc207.eagensam.layout.*;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 * Modified with more tests by Sam Eagen
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextLine block = new TextLine("Hello");
    TextLine block2 = new TextLine("World");

    TextBlock centered = new BoxedBlock(new VComposition(new CenteredBlock(block, 10), new CenteredBlock(block2, 10)));
    TextBlock pair1 = new BlockPair(new BoxedBlock(new VComposition(new CenteredBlock(block, 10), new CenteredBlock(block2, 10))));
    TextBlock truncated = new TruncatedBlock(centered, 5);
    TextBlock pair2 = new BlockPair(new TruncatedBlock(centered, 5));
    TextBlock justified = new BoxedBlock(new VComposition(new RightJustified(block, 10), new RightJustified(block2, 10)));
    TextBlock pair3 = new BlockPair(new BoxedBlock(new VComposition(new RightJustified(block, 10), new RightJustified(block2, 10))));
    
    TextBlock grid = new BoxedBlock(new Grid(4, 4, '#'));

    // Print out the block
    TBUtils.print(pen, centered);
    TBUtils.print(pen, truncated);
    TBUtils.print(pen, justified);
    TBUtils.print(pen, pair1);
    TBUtils.print(pen, pair2);
    TBUtils.print(pen, pair3);
    TBUtils.print(pen, grid);

    block2.setContents("Someone");
    TBUtils.print(pen, block2);
    TBUtils.print(pen, centered);
    TBUtils.print(pen, truncated);
    TBUtils.print(pen, justified);
    TBUtils.print(pen, pair1);
    TBUtils.print(pen, pair2);
    TBUtils.print(pen, pair3);

    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
