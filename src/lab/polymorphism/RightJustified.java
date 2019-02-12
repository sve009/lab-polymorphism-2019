

public class RightJustified implements TextBlock {
        private TextBlock block;
        private int width;

        public RightJustified(TextBlock block, int width) throws Exception {
                if (block.width() > width) {
                        throw new Exception("Provided width is too small for block");
                }

                this.block = block;
                this.width = width;
        }

        public String row(int i) throws Exception {
                int displacement = this.width - this.block.width();

                String returnRow = new String();

                for (int j = 0; j < displacement; j++) {
                        returnRow += ' ';
                }

                returnRow += this.block.row(i);

                return returnRow;
        }

        public int width() {
                return this.width;
        }

        public int height() {
                return this.block.height();
        }
}
