
public class CenteredBlock implements TextBlock {
        private TextBlock block;
        private int width;

        public CenteredBlock(TextBlock block, int width) throws Exception {
                if (block.width() > width) {
                        System.out.println(this.block.width() + " " + width);
                        throw new Exception("The width is smaller than the TextBlock width");
                }

                this.block = block;
                this.width = width;
        }

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
        }

        public int width() {
                return this.width;
        }

        public int height() {
                return this.block.height();
        }
}
