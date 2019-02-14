package com.mcfarevee.groceries;

/**
 * A class used to represent nonfood
 * items in a grocery store.
 * Written by Kabir Jain and Sam Eagen
 */
public class NonFood implements Item {
  //fields----------------------

  public String name;
  public Weight weight;
  public int price;

  //constructor------------------

  public NonFood (String name, Weight weight, int price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }

  //methods----------------------

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


  public String getType() {
    return "";
  }

  public Item stack(int count) {
    return null;
  }

  public String getName() {
    return this.name;
  }
}


