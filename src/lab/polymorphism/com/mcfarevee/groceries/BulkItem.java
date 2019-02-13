

public class BulkItem implements Item {
        private BulkFood food;
        private Unit unit;
        private int amount;

        public BulkItem(BulkFood food, Unit unit, int amount) {
                this.food = food;
                this.unit = unit;
                this.amount = amount;
        }

        public Weight getWeight() {
                return new Weight(this.unit, this.amount);
        }

        public int getPrice() {
                return this.amount * this.food.pricePerUnit;
        }

        public boolean equals(BulkItem other) {
                return this.food.equals(other.food) && this.unit.equals(other.unit) && this.amount == other.amount;
        }

        public String toString() {
                return amount + " " + unit + "s" + " of " + food.name;
        }
}

