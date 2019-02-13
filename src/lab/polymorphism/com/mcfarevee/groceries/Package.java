package com.mcfarevee.groceries;

public class Package implements Item {
        public String name;
        public Weight weight;
        public int price;

        public Package(String name, Weight weight, int price) {
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

        public boolean equals(Package other) {
                return this.name == other.name && this.weight == other.weight 
                        && this.price == other.price;
        }

        public String toString() {
                return weight + " of " + name;
        }
}
