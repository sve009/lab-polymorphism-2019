

public class BlockPair implements TextBlock {
        private TextBlock block;

        public BlockPair(TextBlock block) {
                this.block = block;
        }

        public String row(int i) throws Exception {
                String returnRow = this.block.row(i) + this.block.row(i);

                return returnRow;
        }

        public int width() {
                return 2 * this.block.width();
        }

        public int height() {
                return this.block.height();
        }
}
