package com.mcfarevee.groceries;

public class NonFood implements Item {
        public String name;
        public Weight weight;
        public int price;

        public NonFood (String name, Weight weight, int price) {
                this.name = name;
                this.weight = weight;
                this.price = price;
        }

        public Weight getWeight() {
                return this.weight;
        }

        public int getPrice() {
                return this.price;
        }

        public boolean equals(NonFood other) {
                return this.name.equals(other.name) && this.weight.equals(other.weight)
                        && this.price == other.price;                            
        }

        public String toString() {
                return this.name;
        }

        public int getCount() {
                return 1;
        }
}


