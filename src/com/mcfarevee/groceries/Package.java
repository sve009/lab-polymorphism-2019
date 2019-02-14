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
                return this.name.equals(other.name) && this.weight.equals(other.weight)  
                        && this.price == other.price;
        }

        public String toString() {
                return weight + " package of " + name;
        }

        public int getCount() {
                return 1;
        }

        public String getType() {
                return "Package" + name + weight + price;
        }

        public Item stack(int count) {
                return new ManyPackages(this, count + 1);
        }

        public String getName() {
                return this.name;
        }
}
