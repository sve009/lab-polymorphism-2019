package com.mcfarevee.groceries;

/**
 * Utility class used to pair a unit and amount.
 * Written by Sam Eagen
 */
public class Weight {
  //fields--------------

  public Unit unit;
  public int amount;

  //constructor----------------

  public Weight(Unit unit, int amount) {
    this.unit = unit;
    this.amount = amount;
  }

  //methods-------------------

  public String toString() {
    return amount + " " + unit + (amount == 1 ? "" : "s");
  }
}
