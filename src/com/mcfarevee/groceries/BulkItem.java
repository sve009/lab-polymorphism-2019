package com.mcfarevee.groceries;

/**
 * One of the classes implementing Item
 * It's used for storing food items in a cart
 * Most methods are getters.
 * Written by Sam Eagen
 */
public class BulkItem implements Item {
  //fields---------------------

  private BulkFood food;
  private Unit unit;
  private int amount;

  //constructor------------------

  public BulkItem(BulkFood food, Unit unit, int amount) {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  }

  //methods---------------------

  public Weight getWeight() {
    return new Weight(this.unit, this.amount);
  }

  public int getPrice() {
    return this.amount * this.food.pricePerUnit();
  }

  public boolean equals(BulkItem other) {
    return this.food.equals(other.food) && this.unit.equals(other.unit) && this.amount == other.amount;
  }

  public String toString() {
    return amount + " " + unit + (amount == 1 ? "" : "s") + " of " + food.name();
  }

  public int getCount() {
    return 1;
  }

  public String getName() {
    return this.food.name();
  }

  public String getType() {
    return "BulkItem " + food.name() + unit;
  }

  public Item stack(int count) {
    this.amount += count;
    return null;
  }
}

