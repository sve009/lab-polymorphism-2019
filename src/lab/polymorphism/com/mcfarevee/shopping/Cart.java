
import java.util.Vector;

public class Cart {
        private Vector<Item> cart;

        public Cart() {
                this.cart = new Vector<Item>();
        }

        public void addItem(Item item) {
                cart.add(item);
        }

        public int numThings() {
                int total = 0;
                for (int i = 0; i < cart.size(); i++) {
                        total += cart.get(i).count();
                }

                return total;
        }

        public int numEntries() {
                return cart.size();
        }

        public void printContents(PrintWriter pen) {
                for (int i = 0; i < cart.size(); i++) {
                        pen.println(cart.get(i));
                }
        }

        public int getPrice() {
                int total = 0;
                for (int i = 0; i < cart.size(); i++) {
                        total += cart.get(i).getPrice();
                }

                return total;
        }
}

      

