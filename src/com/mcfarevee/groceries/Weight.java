package com.mcfarevee.groceries;

public class Weight {
        public Unit unit;
        public int amount;
        
        public Weight(Unit unit, int amount) {
          this.unit = unit;
          this.amount = amount;
        }

        public String toString() {
                return amount + " " + unit + (amount == 1 ? "" : "s");
        }
}
