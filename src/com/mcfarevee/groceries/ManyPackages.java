package com.mcfarevee.groceries;

public class ManyPackages implements Item {
        private Package type;
        private int count;

        public ManyPackages(Package type, int count) {
                this.type = type;
                this.count = count;                   
        }

        public Weight getWeight() {
                return new Weight(type.getWeight().unit, type.getWeight().amount * count;
        }

        public int getPrice() {
                return this.type.price * this.count;
        }

        public String toString() {
                return Integer.toString(count) + type + "s";
        }
}
