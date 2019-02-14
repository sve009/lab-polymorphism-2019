package com.mcfarevee.groceries;

public interface Item {
        public Weight getWeight();

        public int getPrice();

        public String toString();

        public int getCount();

        public String getName();

        public String getType();

        public Item stack(int count);

}
